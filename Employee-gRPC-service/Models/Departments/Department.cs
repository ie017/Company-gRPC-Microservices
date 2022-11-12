namespace Employee_gRPC_service.Models {
    public class Department {
    public string? D_no{get; set;}
    private string? name{get; set;}
    private string? speciality{get; set;}
    private ICollection<Employee>? employees{get; set;}
    private Employee? manager{get; set;}
    private ICollection<Department>? subDepartments{get; set;}
    private ICollection<Project>? projects{get; set;}
    }
}