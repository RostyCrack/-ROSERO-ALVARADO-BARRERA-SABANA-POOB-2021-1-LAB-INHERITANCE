import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class SabanaPayroll {

    private ArrayList<Department> departments;

    public SabanaPayroll() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        this.departments.add(d);
    }


    public void printPayroll() {
        for (Department department : this.departments) {
            department.stringEmployees();
        }
    }

    public double calculateEmployeeSalary(UUID id) {
        for (Department department : this.departments) {
            if (department.contains(id)) {
                return department.calculateEmployeeSalary(id);
            }
        }
        return 0;
    }

    public void calculateDepartmentSalary(UUID id) {
    }

    public double calculateUniversitySalaries() {
        double salaries = 0;
        for (Department department: this.departments){
            salaries += department.getDepartmentSalary();
        }
        return salaries;
    }

    public int departmentSize() {
        return this.departments.size();
    }
}



