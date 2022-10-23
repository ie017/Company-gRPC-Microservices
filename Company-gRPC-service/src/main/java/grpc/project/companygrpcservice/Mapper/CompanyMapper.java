package grpc.project.companygrpcservice.Mapper;

import grpc.project.companygrpcservice.Company.Company;
import grpc.project.companygrpcservice.Department.Department;
import grpc.project.companygrpcservice.Employee.Employee;
import grpc.project.companygrpcservice.Enums.Gender;
import grpc.project.companygrpcservice.HumanResource.HumanResource;
import grpc.project.companygrpcservice.Person.Person;
import grpc.project.companygrpcservice.Project.Project;
import grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CompanyMapper {

    public CompanyOuterClass.Company fromCompany(Company company){
        CompanyOuterClass.Company companyMessage = CompanyOuterClass.Company.newBuilder()
                .setName(company.getName())
                .setId(company.getId())
                .addAllDepartments(company.getDepartments().stream().map(dep -> fromDepartment(dep)).collect(Collectors.toList()))
                .setHumanResource(fromHumanResource(company.getHumanResource()))
                .build();
        return companyMessage;
    }
    public CompanyOuterClass.Department fromDepartment(Department department){
        CompanyOuterClass.Department departmentMessage = CompanyOuterClass.Department.newBuilder()
                .setName(department.getName())
                .setDNo(department.getD_no())
                .setManager(fromEmployee(department.getManager()))
                .addAllProjects(department.getProjects().stream().map(pro -> fromProject(pro)).collect(Collectors.toList()))
                .build();
        return departmentMessage;
    }
    public CompanyOuterClass.Employee fromEmployee(Employee employee){
        CompanyOuterClass.Employee employeeMessage = CompanyOuterClass.Employee.newBuilder()
                .setEmployee(fromPerson(new Person(employee.getId(), employee.getName(),
                        employee.getAddress(), employee.getGender(), employee.getDob())))
                .setDoj(employee.getDoj().getTime())
                .addAllDepartments(employee.getDepartments().stream().map(dep -> fromDepartment(dep)).collect(Collectors.toList()))
                .addAllProjects(employee.getProjects().stream().map(pro -> fromProject(pro)).collect(Collectors.toList()))
                .build();
        return employeeMessage;
    }
    public CompanyOuterClass.Person fromPerson(Person person){
        CompanyOuterClass.Person personMessage = CompanyOuterClass.Person.newBuilder()
                .setId(person.getId())
                .setName(person.getName())
                .setAddress(person.getAddress())
                .setDob(person.getDob().getTime())
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
    public CompanyOuterClass.Project fromProject(Project project){
        CompanyOuterClass.Project projectMessage = CompanyOuterClass.Project.newBuilder()
                .setName(project.getName())
                .setDeadLine(project.getDeadLine().getTime())
                .setFinished(project.isFinished())
                .addAllEmployees(project.getEmployees().stream().map(emp -> fromEmployee(emp)).collect(Collectors.toList()))
                .build();
        return projectMessage;
    }
    public CompanyOuterClass.HumanResource fromHumanResource(HumanResource humanResource){
        CompanyOuterClass.HumanResource humanResourceMessage = CompanyOuterClass.HumanResource.newBuilder()
                .addAllEmployees(humanResource.getEmployees().stream().map(emp -> fromEmployee(emp)).collect(Collectors.toList()))
                .build();
        return humanResourceMessage;
    }


    public Department fromDepartmentMessage(CompanyOuterClass.Department departmentMessage){
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
    public Person fromPersonMessage(CompanyOuterClass.Person personMessage){
        Person person = Person.builder()
                .id(personMessage.getId())
                .name(personMessage.getName())
                .address(personMessage.getAddress())
                .dob(personMessage.getDob().)
                .gender(fromGenderMessage(personMessage.getGender()))
                .build();
        return person;
    }
    public Employee fromEmployeeMessage(CompanyOuterClass.Employee employeeMessage){
        Employee employee = new Employee(employeeMessage.getDoj(), employeeMessage.getDepartmentsList().stream()
                .map(dep ->fromDepartmentMessage(dep)).collect(Collectors.toList()), employeeMessage.
                getProjectsList().stream().map(pro -> fromProjectMessage(pro)).collect(Collectors.toList()));
        employee.setAddress(employeeMessage.getEmployee().getAddress());
        employee.setId(employeeMessage.getEmployee().getId());
        employee.setName(employeeMessage.getEmployee().getName());
        employee.setGender(fromGenderMessage(employeeMessage.getEmployee().getGender()));
        employee.setDob(employeeMessage.getEmployee().getDob());
        return employee;
    }
    public Project fromProjectMessage(CompanyOuterClass.Project projectMessage){
        Project project = Project.builder()
                .name(projectMessage.getName())
                .deadLine(projectMessage.getDeadLine())
                .finished(projectMessage.getFinished())
                .employees(projectMessage.getEmployeesList().stream().map(emp -> fromEmployeeMessage(emp)).collect(Collectors.toList()))
                .build();
        return project;
    }
}
