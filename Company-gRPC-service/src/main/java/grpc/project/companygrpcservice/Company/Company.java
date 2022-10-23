package grpc.project.companygrpcservice.Company;

import grpc.project.companygrpcservice.Department.Department;
import grpc.project.companygrpcservice.Enums.Gender;
import grpc.project.companygrpcservice.HumanResource.HumanResource;
import grpc.project.companygrpcservice.Project.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.Date;

@Document
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Company {
    @Id
    private String id;
    private String name;
    private Collection<Department> departments;
    private HumanResource humanResource;
}
