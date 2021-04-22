import java.util.*;

public class Department{

    private UUID id;
    private String name;
    private HashMap <UUID, Employee> employees;

    public Department(String name) {
        this.employees = new HashMap<>();
        this.id = UUID.randomUUID();
        this.name = name;

    }


    public void addEmployee(Employee e){
        this.employees.put(e.getId(), e);
    }

    public String getName(){
        return this.name;
    }

    public boolean contains(UUID id) {
        return this.employees.containsKey(id);
    }

    public double calculateEmployeeSalary(UUID id) {
        return this.employees.get(id).calculateSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employees);
    }



    public void stringEmployees(){
        for (UUID id: employees.keySet()){
            System.out.println((employees.get(id)).toString());
        }
    }

    public double getDepartmentSalary() {
        double salary = 0;
        for (UUID id: employees.keySet()){
            salary += (employees.get(id)).calculateSalary();
        }
        return salary;
    }


    public UUID getID() {
        return this.id;
    }
}
