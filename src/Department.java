import java.util.ArrayList;
import java.util.UUID;

public class Department {

    public UUID id;
    private String name;
    private ArrayList<Employee> employees;

    public Employee getEmployee(int i) {
        return employees.get(i);
    }
}
