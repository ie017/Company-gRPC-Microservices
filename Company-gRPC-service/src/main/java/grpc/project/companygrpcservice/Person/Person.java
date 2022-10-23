package grpc.project.companygrpcservice.Person;

import grpc.project.companygrpcservice.Department.Department;
import grpc.project.companygrpcservice.Enums.Gender;
import grpc.project.companygrpcservice.Project.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Person {
    @Id
    private String id;
    private String name;
    private String address;
    private Gender gender;
    private Date dob;
}
