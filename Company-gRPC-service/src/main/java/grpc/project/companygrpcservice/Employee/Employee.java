package grpc.project.companygrpcservice.Employee;

import grpc.project.companygrpcservice.Department.Department;
import grpc.project.companygrpcservice.Person.Person;
import grpc.project.companygrpcservice.Project.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
public class Employee extends Person {
    private Date doj;
    private Collection<Department> departments;
    private Collection<Project> projects;
}
