package grpc.project.companygrpcservice;

import grpc.project.companygrpcservice.Company.Company;
import grpc.project.companygrpcservice.Company.CompanyRepository;
import grpc.project.companygrpcservice.Department.Department;
import grpc.project.companygrpcservice.HumanResource.HumanResource;
import grpc.project.companygrpcservice.gRPC.service.CompanyServiceImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.UUID;

@SpringBootApplication
public class CompanyGRpcServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyGRpcServiceApplication.class, args);
    }

    //@Bean
    CommandLineRunner runner(CompanyRepository companyRepository){
        return args -> {
            /*companyRepository.save(new Company(UUID.randomUUID().toString(), "DELL", new ArrayList<Department>(),new HumanResource()));*/
            companyRepository.save(Company.builder()
                    .id(UUID.randomUUID().toString())
                    .name("DELL")
                    .departments(new ArrayList<>())
                    .humanResource(null)
                    .build());
        };
    }

}
