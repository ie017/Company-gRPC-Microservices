package grpc.project.companygrpcservice.HumanResource;

import grpc.project.companygrpcservice.Employee.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class HumanResource {
    private Collection<Employee> employees;
}
