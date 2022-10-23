package grpc.project.companygrpcservice.Company;

import grpc.project.companygrpcservice.Department.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CompanyRepository extends MongoRepository<Company, String> {
}
