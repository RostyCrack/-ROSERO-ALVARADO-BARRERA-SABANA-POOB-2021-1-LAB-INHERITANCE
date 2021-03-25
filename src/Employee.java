import java.util.UUID;

public class Employee {
    
    public UUID id;
    private String name;
    private String lastName;
    private Department department;
    private double salary;


    public Department getDepartment() {
        return department;
    }

    public String getFullName() {
        return name+" "+lastName;
    }

    public double getSalary() {
        return salary;
    }

}
