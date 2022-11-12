using Employee_gRPC_service.Enums;

namespace Employee_gRPC_service.Models {
    public class Project {
        public string? Id{get; set;}
        private string? name;
        private DateTime? deadLine;
        private Boolean finished;
        private ICollection<Employee>? employees;
        private StatusProject statusProject;
    }
}