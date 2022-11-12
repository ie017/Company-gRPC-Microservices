using Employee_gRPC_service.Enums;

namespace Employee_gRPC_service.Models {
    public class Employee {
        private string? id{get; set;}
        private string? name{get; set;}
        private string? address{get; set;}
        private Gender gender{get; set;}
        private DateTime dob{get; set;}
        private DateTime doj{get; set;}
        private ICollection<Department>? departments{get; set;}
        private ICollection<Project>? projects{get; set;}
    }
}