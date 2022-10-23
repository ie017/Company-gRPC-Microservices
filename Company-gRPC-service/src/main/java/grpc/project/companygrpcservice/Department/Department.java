package grpc.project.companygrpcservice.Department;

import grpc.project.companygrpcservice.Employee.Employee;
import grpc.project.companygrpcservice.Project.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Collection;
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Department {
    @Id
    private String D_no;
    private String name;
    private String speciality;
    private Collection<Employee> employees;
    private Employee manager;
    private Collection<Department> subDepartments;
    private Collection<Project> projects;
}
