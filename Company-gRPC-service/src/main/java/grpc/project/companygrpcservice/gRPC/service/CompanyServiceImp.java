package grpc.project.companygrpcservice.gRPC.service;

import grpc.project.companygrpcservice.Company.Company;
import grpc.project.companygrpcservice.Company.CompanyRepository;
import grpc.project.companygrpcservice.Department.Department;
import grpc.project.companygrpcservice.Employee.Employee;
import grpc.project.companygrpcservice.HumanResource.HumanResource;
import grpc.project.companygrpcservice.Mapper.CompanyMapper;
import grpc.project.companygrpcservice.Project.Project;
import grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass;
import grpc.project.companygrpcservice.gRPC.stub.CompanyServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@GrpcService
public class CompanyServiceImp extends CompanyServiceGrpc.CompanyServiceImplBase {
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public void createCompany(CompanyOuterClass.setNameCompany request, StreamObserver<CompanyOuterClass.Company> responseObserver) {
        if (request.getName() != null) {
            Company company = Company.builder()
                    .id(UUID.randomUUID().toString())
                    .name(request.getName())
                    .humanResource(new HumanResource(new ArrayList<Employee>()))
                    .departments(new ArrayList<Department>())
                    .build();
            companyRepository.save(company);
            responseObserver.onNext(companyMapper.fromCompany(company));
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getCompany(CompanyOuterClass.setCompanyId request, StreamObserver<CompanyOuterClass.Company> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if(company != null){
                responseObserver.onNext(companyMapper.fromCompany(company));
                responseObserver.onCompleted();
            }
        }
    }

    @Override
    public void getHumanResource(CompanyOuterClass.setCompanyId request, StreamObserver<CompanyOuterClass.HumanResource> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if(company != null){
                responseObserver.onNext(companyMapper.fromCompany(company).getHumanResource());
                responseObserver.onCompleted();
            }
        }
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
                responseObserver.onCompleted();
            }
        }
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
                        responseObserver.onCompleted();
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void getAllEmployeesOfDepartment(CompanyOuterClass.setCompanyIdAndDepartmentId request, StreamObserver<CompanyOuterClass.allEmployees> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                for(Department dep: company.getDepartments()){
                    if (dep.getD_no() == request.getDepartmentId()){
                        CompanyOuterClass.allEmployees allEmployees = CompanyOuterClass.allEmployees.newBuilder()
                                .addAllEmployees(dep.getEmployees().stream().map(emp -> companyMapper.fromEmployee(emp)).collect(Collectors.toList()))
                                .build();
                        companyRepository.save(company);
                        responseObserver.onNext(allEmployees);
                        responseObserver.onCompleted();
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void addDepartmentToCompany(CompanyOuterClass.setCompanyIdAndDepartment request, StreamObserver<CompanyOuterClass.Company> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                if (request.getDepartment() != null){
                 company.getDepartments().add(companyMapper.fromDepartmentMessage(request.getDepartment()));
                 companyRepository.save(company);
                 responseObserver.onNext(companyMapper.fromCompany(company));
                 responseObserver.onCompleted();
                }
            }
        }
    }

    @Override
    public void deleteDepartmentsFromCompany(CompanyOuterClass.setCompanyIdAndDepartmentId request, StreamObserver<CompanyOuterClass.Company> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if(company != null){
                for(Department dep: company.getDepartments()){
                    if (dep.getD_no() == request.getDepartmentId()){
                        company.getDepartments().remove(dep);
                        companyRepository.save(company);
                        /*Suppression dans le service Department*/
                        responseObserver.onNext(companyMapper.fromCompany(company));
                        responseObserver.onCompleted();
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void hireEmployee(CompanyOuterClass.setCompanyIdAndPerson request, StreamObserver<CompanyOuterClass.Employee> responseObserver) {
        if (request.getCompanyId() != null) {
            Company company = companyRepository.findById(request.getCompanyId()).orElse(null);
            if (company != null){
                Employee employee = new Employee(new Date(), new ArrayList<Department>(), new ArrayList<Project>());
                employee.setDob(request.getPerson().getDob());
                employee.setName(request.getPerson().getName());
                employee.setGender(companyMapper.fromGenderMessage(request.getPerson().getGender()));
                employee.setId(request.getPerson().getId());
                employee.setAddress(request.getPerson().getAddress());

            }
        }
    }

    @Override
    public void addEmployeeToHumanResource(CompanyOuterClass.setCompanyIdAndEmployeeId request, StreamObserver<CompanyOuterClass.HumanResource> responseObserver) {
        super.addEmployeeToHumanResource(request, responseObserver);
    }

    @Override
    public void addEmployeeToDepartment(CompanyOuterClass.setCompanyIdAndEmployeeId request, StreamObserver<CompanyOuterClass.Department> responseObserver) {
        super.addEmployeeToDepartment(request, responseObserver);
    }

    @Override
    public void dismissFromHumanResource(CompanyOuterClass.setCompanyIdAndEmployeeId request, StreamObserver<CompanyOuterClass.Status> responseObserver) {
        super.dismissFromHumanResource(request, responseObserver);
    }

    @Override
    public void dismissFromDepartment(CompanyOuterClass.setCompanyIdAndEmployeeId request, StreamObserver<CompanyOuterClass.Status> responseObserver) {
        super.dismissFromDepartment(request, responseObserver);
    }

    @Override
    public void dismissEmployee(CompanyOuterClass.Employee request, StreamObserver<CompanyOuterClass.Status> responseObserver) {
        super.dismissEmployee(request, responseObserver);
    }

    @Override
    public void startProject(CompanyOuterClass.setCompanyAndProjectAndDepartment request, StreamObserver<CompanyOuterClass.Status> responseObserver) {
        super.startProject(request, responseObserver);
    }

    @Override
    public void sellProject(CompanyOuterClass.setCompanyAndProjectAndDepartment request, StreamObserver<CompanyOuterClass.Status> responseObserver) {
        super.sellProject(request, responseObserver);
    }

    @Override
    public void finishProject(CompanyOuterClass.setCompanyAndProjectAndDepartment request, StreamObserver<CompanyOuterClass.Status> responseObserver) {
        super.finishProject(request, responseObserver);
    }
}