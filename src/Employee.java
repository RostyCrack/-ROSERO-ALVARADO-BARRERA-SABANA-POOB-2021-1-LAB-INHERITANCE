import java.util.UUID;

public class Employee {
    
    private UUID id;
    private String name;
    private String lastName;
    private Department department;
    private double salary;

    public Employee(String name, String lastName, Department department, double salary){
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString(){
        return String.format("%s %s, department %s, salary %s", this.name, this.lastName, this.department.getName(), this.getSalary());
    }



}
