package grpc.project.companygrpcservice.gRPC.service;

import grpc.project.companygrpcservice.Company.Company;
import grpc.project.companygrpcservice.Company.CompanyRepository;
import grpc.project.companygrpcservice.Company.CompanyRestController;
import grpc.project.companygrpcservice.Department.Department;
import grpc.project.companygrpcservice.Employee.Employee;
import grpc.project.companygrpcservice.Enums.StatusProject;
import grpc.project.companygrpcservice.HumanResource.HumanResource;
import grpc.project.companygrpcservice.Mapper.CompanyMapper;
import grpc.project.companygrpcservice.Project.Project;
import grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass;
import grpc.project.companygrpcservice.gRPC.stub.CompanyServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import java.util.stream.Collectors;

@GrpcService
public class CompanyServiceImp extends CompanyServiceGrpc.CompanyServiceImplBase {
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private CompanyRestController companyRestController;

    @Override
    public void createCompany(CompanyOuterClass.setNameCompany request, StreamObserver<CompanyOuterClass.returnCompany> responseObserver) {
        if (request.getName() != null) {
            Company company = Company.builder()
                    .id(UUID.randomUUID().toString())
                    .name(request.getName())
                    .humanResource(new HumanResource(new ArrayList<Employee>()))
                    .departments(new ArrayList<Department>())
                    .build();
            companyRepository.save(company);
            responseObserver.onNext(companyMapper.fromCompany(company));
        } else {
            responseObserver.onError(new Throwable("Please set company's name"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getCompany(CompanyOuterClass.setCompanyId request, StreamObserver<CompanyOuterClass.returnCompany> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if(company != null){
                responseObserver.onNext(companyMapper.fromCompany(company));
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getHumanResource(CompanyOuterClass.setCompanyId request, StreamObserver<CompanyOuterClass.allEmployees> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if(company != null){
                responseObserver.onNext(CompanyOuterClass.allEmployees.newBuilder()
                        .addAllEmployee(companyMapper.fromCompany(company).getEmployeesList())
                        .build());
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getAllDepartments(CompanyOuterClass.setCompanyId request, StreamObserver<CompanyOuterClass.allDepartments> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if(company != null){
                CompanyOuterClass.allDepartments allDepartments = CompanyOuterClass.allDepartments.newBuilder()
                        .addAllDepartments(companyMapper.fromCompany(company).getDepartmentsList())
                        .build();
                responseObserver.onNext(allDepartments);
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();

    }

    @Override
    public void getAllProjectsOfDepartment(CompanyOuterClass.setCompanyIdAndDepartmentId request, StreamObserver<CompanyOuterClass.allProjects> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                for(Department dep: company.getDepartments()){
                    if (dep.getD_no() == request.getDepartmentId()){
                        CompanyOuterClass.allProjects allProjects = CompanyOuterClass.allProjects.newBuilder()
                                .addAllProjects(dep.getProjects().stream().map(pro -> companyMapper.fromProject(pro)).collect(Collectors.toList()))
                                .build();
                        companyRepository.save(company);
                        responseObserver.onNext(allProjects);
                        break;
                    }
                }
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();

    }

    @Override
    public void getAllEmployeesOfDepartment(CompanyOuterClass.setCompanyIdAndDepartmentId request, StreamObserver<CompanyOuterClass.allEmployees> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                for(Department dep: company.getDepartments()){
                    if (dep.getD_no() == request.getDepartmentId()){
                        CompanyOuterClass.allEmployees allEmployees = CompanyOuterClass.allEmployees.newBuilder()
                                .addAllEmployee(dep.getEmployees().stream().map(emp -> companyMapper.fromEmployee(emp)).collect(Collectors.toList()))
                                .build();
                        companyRepository.save(company);
                        responseObserver.onNext(allEmployees);
                        break;
                    }
                }
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void addDepartmentToCompany(CompanyOuterClass.setCompanyIdAndDepartment request, StreamObserver<CompanyOuterClass.getDepartment> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                if (request.getName() != null){
                    Department department = new Department(UUID.randomUUID().toString(), request.getName(), request.getSpeciality(), new ArrayList<>(), null, new ArrayList<>(), new ArrayList<>());
                 company.getDepartments().add(department);
                 /* Save Department in DepartmentService*/
                    companyRestController.saveDepartment(department);
                 companyRepository.save(company);
                 responseObserver.onNext(companyMapper.fromDepartment(department));
                }
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void deleteDepartmentsFromCompany(CompanyOuterClass.setCompanyIdAndDepartmentId request, StreamObserver<CompanyOuterClass.Status> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if(company != null){
                for(Department dep: company.getDepartments()){
                    if (dep.getD_no() == request.getDepartmentId()){
                        company.getDepartments().remove(dep);
                        companyRepository.save(company);
                        /*Suppression dans le service Department*/
                        companyRestController.deleteDepartmentFromDepartmentService(request.getDepartmentId());
                        responseObserver.onNext(CompanyOuterClass.Status.newBuilder()
                                .setStatus(true)
                                .build());
                        break;
                    }
                }
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void hireEmployee(CompanyOuterClass.setCompanyIdAndPerson request, StreamObserver<CompanyOuterClass.getEmployee> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                Employee employee = new Employee(new Date(), new ArrayList<Department>(), new ArrayList<Project>());
                employee.setDob(new Date(request.getDob().getYear(),request.getDob().getMonth(), request.getDob().getDay()));
                employee.setName(request.getName());
                employee.setGender(companyMapper.fromGenderMessage(request.getGender()));
                employee.setId(UUID.randomUUID().toString());
                employee.setAddress(request.getAddress());
                /* Add Employee to employeeService */
                companyRestController.saveEmployee(companyMapper.fromEmployee(employee));
                responseObserver.onNext(companyMapper.fromEmployee(employee));
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void addEmployeeToHumanResource(CompanyOuterClass.setCompanyIdAndEmployeeId request, StreamObserver<CompanyOuterClass.allEmployees> responseObserver) throws ParseException {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                /* Use employee client to get employee from employee-service*/
                CompanyOuterClass.Employee employee = companyRestController.getEmployee(request.getEmployeeId());
                if (employee != null){
                    company.getHumanResource().getEmployees().add(companyMapper.fromEmployeeMessage(employee));
                    /* Add employee to HumanResource service */
                    companyRestController.setEmployeeInHumanResourceService(employee);
                    companyRepository.save(company);
                    responseObserver.onNext(CompanyOuterClass.allEmployees.newBuilder()
                            .addAllEmployee(company.getHumanResource().getEmployees().stream().map(empl -> companyMapper.fromEmployee(empl)).collect(Collectors.toList()))
                            .build());
                } else {
                    responseObserver.onError(new Throwable("Please set the correct employee's id"));
                }
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();

    }

    @Override
    public void addEmployeeToDepartment(CompanyOuterClass.setCompanyIdAndDepartmentIdAndEmployeeId request, StreamObserver<CompanyOuterClass.getDepartment> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                /* Use employee client to get employee from employee-service*/
                CompanyOuterClass.Employee employee = companyRestController.getEmployee(request.getEmployeeId());
                if (employee != null){
                    for (Department dep : company.getDepartments()) {
                        if (dep.getD_no() == request.getDepartmentId()) {
                            dep.getEmployees().add(companyMapper.fromEmployeeMessage(employee));
                            company.getDepartments().removeIf(department -> department.getD_no() == request.getDepartmentId());
                            company.getDepartments().add(dep);
                            /* Modify department from departmentService using CompanyRestController */
                            companyRestController.addEmployeeToDepartment(request);
                            companyRepository.save(company);
                            responseObserver.onNext(companyMapper.fromDepartment(dep));
                            break;
                        }
                    }
                } else {
                    responseObserver.onError(new Throwable("Please set the correct employee's id"));
                }
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();

    }

    @Override
    public void dismissFromHumanResource(CompanyOuterClass.setCompanyIdAndEmployeeId request, StreamObserver<CompanyOuterClass.allEmployees> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                boolean remove = company.getHumanResource().getEmployees().removeIf(employee1 -> employee1.getId() == request.getCompanyId());
                if (remove == true) {
                    /* Remove employee from HumanResource service  */
                    companyRestController.deleteEmployeeFromHumanResourceService(request);
                    companyRepository.save(company);
                    responseObserver.onNext(CompanyOuterClass.allEmployees.newBuilder()
                            .addAllEmployee(company.getHumanResource().getEmployees().stream().map(empl -> companyMapper.fromEmployee(empl)).collect(Collectors.toList()))
                            .build());
                } else {
                    responseObserver.onError(new Throwable("The specify employee doesn't exist in this company's Human Resource"));
                }
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();

    }

    @Override
    public void dismissFromDepartment(CompanyOuterClass.setCompanyIdAndDepartmentIdAndEmployeeId request, StreamObserver<CompanyOuterClass.getDepartment> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                for (Department dep : company.getDepartments()) {
                    if (dep.getD_no() == request.getDepartmentId()) {
                        boolean remove = dep.getEmployees().removeIf(employee1 -> employee1.getId() == request.getCompanyId());
                        if (remove == true) {
                            company.getDepartments().removeIf(department -> department.getD_no() == request.getDepartmentId());
                            company.getDepartments().add(dep);
                            /* Remove employee from Department service  */
                            companyRestController.deleteEmployeeFromDepartmentService(request);
                            companyRepository.save(company);
                            responseObserver.onNext(companyMapper.fromDepartment(dep));
                            responseObserver.onCompleted();
                        } else {
                            responseObserver.onError(new Throwable("The specify employee doesn't exist in this company's Human Resource"));
                        }
                    }
                }
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void dismissEmployee(CompanyOuterClass.setCompanyIdAndEmployeeId request, StreamObserver<CompanyOuterClass.Status> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (request.getEmployeeId() != null && company != null) {
                for (Department department : company.getDepartments()) {
                    department.getEmployees().removeIf(employee1 -> employee1.getId() == request.getCompanyId());
                }
                company.getHumanResource().getEmployees().removeIf(employee1 -> employee1.getId() == request.getCompanyId());
                /* Send request to Employee Service to remove employee */
                companyRestController.deleteEmployeeFromEmployeeService(request.getCompanyId());
                responseObserver.onNext(CompanyOuterClass.Status.newBuilder()
                        .setStatus(true)
                        .build());
            } else {
                responseObserver.onNext(CompanyOuterClass.Status.newBuilder()
                        .setStatus(false)
                        .build());
            }
        }  else {
        responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();
    }


    @Override
    public void startProject(CompanyOuterClass.setCompanyIdAndProjectAndDepartmentIdAndEmployees request, StreamObserver<CompanyOuterClass.getDepartment> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                for (Department dep : company.getDepartments()) {
                    if (dep.getD_no() == request.getDepartmentId()) {
                        boolean value = true;
                        for (String employeeId : request.getEmployeesIdsList()) {
                            boolean contains = dep.getEmployees().contains((Employee) companyRestController.getEmployeeById(employeeId));
                            if (contains == false) {
                                value = false;
                                break;
                            }
                        }
                        if (value == true){
                            company.getDepartments().remove(dep);
                            /* Add status Start to project in project Service */
                            companyRestController.updateStatusProject(CompanyOuterClass.setStatusProject.newBuilder()
                                    .setProject(request.getProject())
                                    .setStatus(CompanyOuterClass.StatusProject.START)
                                    .build());
                            Project project = companyMapper.fromProjectMessage(request.getProject());
                            project.setStatusProject(StatusProject.START);
                            dep.getProjects().add(project);
                            company.getDepartments().add(dep);
                            companyRepository.save(company);
                            responseObserver.onNext(companyMapper.fromDepartment(dep));
                        } else {
                            responseObserver.onError(new Throwable("employee doesn't exist in the specify department"));
                        }
                    }
                }
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void sellProject(CompanyOuterClass.setCompanyIdAndProjectAndDepartmentId request, StreamObserver<CompanyOuterClass.getDepartment> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                for (Department dep : company.getDepartments()) {
                    if (dep.getD_no() == request.getDepartmentId()) {
                        boolean exist = dep.getProjects().removeIf(project -> project.getId() == request.getProject().getId());
                        if (exist == true){
                            /* Add status Start to project in project Service */
                            companyRestController.updateStatusProject(CompanyOuterClass.setStatusProject.newBuilder()
                                    .setProject(request.getProject())
                                    .setStatus(CompanyOuterClass.StatusProject.SELL)
                                    .build());
                            company.getDepartments().remove(dep);
                            Project project = companyMapper.fromProjectMessage(request.getProject());
                            project.setStatusProject(StatusProject.SELL);
                            dep.getProjects().add(project);
                            company.getDepartments().add(dep);
                            companyRepository.save(company);
                            responseObserver.onNext(companyMapper.fromDepartment(dep));
                        } else {
                            responseObserver.onError(new Throwable("Your project doesn't found in the specific department"));
                        }
                    }
                }
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void finishProject(CompanyOuterClass.setCompanyIdAndProjectAndDepartmentId request, StreamObserver<CompanyOuterClass.getDepartment> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                for (Department dep : company.getDepartments()) {
                    if (dep.getD_no() == request.getDepartmentId()) {
                        boolean exist = dep.getProjects().removeIf(project -> project.getId() == request.getProject().getId());
                        if (exist == true){
                            /* Add status Start to project in project Service */
                            companyRestController.updateStatusProject(CompanyOuterClass.setStatusProject.newBuilder()
                                    .setProject(request.getProject())
                                    .setStatus(CompanyOuterClass.StatusProject.FINISH)
                                    .build());
                            company.getDepartments().remove(dep);
                            Project project = companyMapper.fromProjectMessage(request.getProject());
                            project.setStatusProject(StatusProject.FINISH);
                            dep.getProjects().add(project);
                            company.getDepartments().add(dep);
                            companyRepository.save(company);
                            responseObserver.onNext(companyMapper.fromDepartment(dep));
                        } else {
                            responseObserver.onError(new Throwable("Your project doesn't found in the specific department"));
                        }
                    }
                }
            } else {
                responseObserver.onError(new Throwable("the Specify company doesn't exist"));
            }
        } else {
            responseObserver.onError(new Throwable("Please set company's id"));
        }
        responseObserver.onCompleted();

    }
}