package grpc.project.companygrpcservice.Project;

import grpc.project.companygrpcservice.Employee.Employee;
import grpc.project.companygrpcservice.Enums.StatusProject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Project {
    private String Id;
    private String name;
    private Date deadLine;
    private boolean finished;
    private Collection<Employee> employees;
    private StatusProject statusProject;
}
