package grpc.project.companygrpcservice.Mapper;

import com.google.protobuf.Timestamp;
import grpc.project.companygrpcservice.Company.Company;
import grpc.project.companygrpcservice.Department.Department;
import grpc.project.companygrpcservice.Employee.Employee;
import grpc.project.companygrpcservice.Enums.Gender;
import grpc.project.companygrpcservice.Enums.StatusProject;
import grpc.project.companygrpcservice.HumanResource.HumanResource;
import grpc.project.companygrpcservice.Person.Person;
import grpc.project.companygrpcservice.Project.Project;
import grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;

@Service
public class CompanyMapper {

    public CompanyOuterClass.returnCompany fromCompany(Company company){
        CompanyOuterClass.returnCompany companyMessage = CompanyOuterClass.returnCompany.newBuilder()
                .setName(company.getName())
                .setId(company.getId())
                .addAllDepartments(company.getDepartments().stream().map(dep -> fromDepartment(dep)).collect(Collectors.toList()))
                .addAllEmployees(company.getHumanResource().getEmployees().stream().map(emp -> fromEmployee(emp)).collect(Collectors.toList()))
                .build();
        return companyMessage;
    }
    public CompanyOuterClass.getDepartment fromDepartment(Department department){
        CompanyOuterClass.getDepartment departmentMessage = CompanyOuterClass.getDepartment.newBuilder()
                .setName(department.getName())
                .setDNo(department.getD_no())
                .addAllEmployees(department.getEmployees().stream().map(emp -> fromEmployee(emp)).collect(Collectors.toList()))
                .addAllSubDepartments(department.getSubDepartments().stream().map(subDep -> fromDepartment(subDep)).collect(Collectors.toList()))
                .setManager(fromEmployee(department.getManager()))
                .addAllProjects(department.getProjects().stream().map(pro -> fromProject(pro)).collect(Collectors.toList()))
                .build();
        return departmentMessage;
    }
    public CompanyOuterClass.getEmployee fromEmployee(Employee employee){
        CompanyOuterClass.getEmployee employeeMessage = CompanyOuterClass.getEmployee.newBuilder()
                .setPerson(fromPerson(new Person(employee.getId(), employee.getName(),
                        employee.getAddress(), employee.getGender(), employee.getDob())))
                .setDoj(CompanyOuterClass.Date.newBuilder()
                        .setDay(employee.getDoj().getDay())
                        .setMonth(employee.getDoj().getDay())
                        .setYear(employee.getDoj().getYear())
                        .build())
                .build();
        return employeeMessage;
    }
    public CompanyOuterClass.Person fromPerson(Person person){
        CompanyOuterClass.Person personMessage = CompanyOuterClass.Person.newBuilder()
                .setId(person.getId())
                .setName(person.getName())
                .setAddress(person.getAddress())
                .setDob(CompanyOuterClass.Date.newBuilder()
                        .setYear(person.getDob().getYear())
                        .setMonth(person.getDob().getMonth())
                        .setDay(person.getDob().getDay())
                        .build())
                .setGender(fromGender(person.getGender()))
                .build();
        return personMessage;
    }
    public CompanyOuterClass.Gender fromGender(Gender gender){
        if (gender == Gender.MALE){
            return CompanyOuterClass.Gender.MALE;
        } else {
            return CompanyOuterClass.Gender.FEMALE;
        }
    }
    public CompanyOuterClass.StatusProject fromStatusProject(StatusProject statusProject){
        if (statusProject == StatusProject.START){
            return CompanyOuterClass.StatusProject.START;
        } else if (statusProject == StatusProject.SELL){
            return CompanyOuterClass.StatusProject.SELL;
        } else {
            return CompanyOuterClass.StatusProject.FINISH;
        }
    }
    public CompanyOuterClass.getProject fromProject(Project project){
        CompanyOuterClass.getProject projectMessage = CompanyOuterClass.getProject.newBuilder()
                .setName(project.getName())
                .setDeadLine(CompanyOuterClass.Date.newBuilder()
                        .setDay(project.getDeadLine().getDay())
                        .setMonth(project.getDeadLine().getMonth())
                        .setYear(project.getDeadLine().getYear())
                        .build())
                .setFinished(project.isFinished())
                .addAllEmployees(project.getEmployees().stream().map(emp -> fromEmployee(emp)).collect(Collectors.toList()))
                .setStatus(fromStatusProject(project.getStatusProject()))
                .build();
        return projectMessage;
    }
    public Department fromDepartmentMessage(CompanyOuterClass.Department departmentMessage) {
        Department department = Department.builder()
                .name(departmentMessage.getName())
                .D_no(departmentMessage.getDNo())
                .manager(fromEmployeeMessage(departmentMessage.getManager()))
                .projects(departmentMessage.getProjectsList().stream().map(pro -> fromProjectMessage(pro)).collect(Collectors.toList()))
                .build();
        return department;
    }
    public Gender fromGenderMessage(CompanyOuterClass.Gender genderMessage){
        if (genderMessage == CompanyOuterClass.Gender.MALE){
            return Gender.MALE;
        } else {
            return Gender.FEMALE;
        }
    }
    public Person fromPersonMessage(CompanyOuterClass.Person personMessage) {
        Person person = Person.builder()
                .id(personMessage.getId())
                .name(personMessage.getName())
                .address(personMessage.getAddress())
                .dob(new Date(personMessage.getDob().getYear(), personMessage.getDob().getMonth(), personMessage.getDob().getDay()))
                .gender(fromGenderMessage(personMessage.getGender()))
                .build();
        return person;
    }
    public Employee fromEmployeeMessage(CompanyOuterClass.Employee employeeMessage) {
        Employee employee = new Employee(new Date(employeeMessage.getDoj().getYear(), employeeMessage.getDoj().getMonth(),
                employeeMessage.getDoj().getDay()), employeeMessage.getDepartmentsList().stream()
                .map(dep -> fromDepartmentMessage(dep)).collect(Collectors.toList()), employeeMessage.
                getProjectsList().stream().map(pro -> fromProjectMessage(pro)).collect(Collectors.toList()));
        employee.setAddress(employeeMessage.getEmployee().getAddress());
        employee.setId(employeeMessage.getEmployee().getId());
        employee.setName(employeeMessage.getEmployee().getName());
        employee.setGender(fromGenderMessage(employeeMessage.getEmployee().getGender()));
        employee.setDob(new Date(employeeMessage.getEmployee().getDob().getYear(), employeeMessage.getEmployee().getDob().getMonth(),
                employeeMessage.getEmployee().getDob().getDay()));
        return employee;
    }
    public Project fromProjectMessage(CompanyOuterClass.Project projectMessage) {
        Project project = Project.builder()
                .name(projectMessage.getName())
                .deadLine(new Date(projectMessage.getDeadLine().getYear(), projectMessage.getDeadLine().getMonth(), projectMessage.getDeadLine().getDay()))
                .finished(projectMessage.getFinished())
                .employees(projectMessage.getEmployeesList().stream().map(emp -> fromEmployeeMessage(emp)).collect(Collectors.toList()))
                .build();
        return project;
    }
}
