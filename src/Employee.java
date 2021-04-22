import java.util.Objects;
import java.util.UUID;

public class Employee {
    
    private UUID id;
    private String name;
    private String lastName;
    private Department department;

    public Employee(String name, String lastName, Department department){
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
        this.department = department;
    }

    public double calculateSalary(){
        return 0;
    }

    @Override
    public String toString(){
        return String.format("%s %s, department %s, salary %s", this.name, this.lastName, this.department.getName(), calculateSalary());
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee that = (Employee) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }
}
