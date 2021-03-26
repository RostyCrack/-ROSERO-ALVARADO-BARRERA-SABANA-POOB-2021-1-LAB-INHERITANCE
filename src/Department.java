import java.util.ArrayList;
import java.util.UUID;

public class Department {

    private UUID id;
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public String getName(){
        return this.name;
    }


    public void stringEmployees(){
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public double getDepartmentSalary() {
        double departmentSalary = 0;
        for (Employee employee : employees) {
            departmentSalary += employee.getSalary();
        }
        return departmentSalary;
    }
}
