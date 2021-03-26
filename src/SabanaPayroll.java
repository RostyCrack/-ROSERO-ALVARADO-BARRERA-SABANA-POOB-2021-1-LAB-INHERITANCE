import java.util.ArrayList;
import java.util.UUID;

public class SabanaPayroll {

    private ArrayList<Department> departments;

    public SabanaPayroll(){

    }



    public void printPayroll(){
        for (Department department: this.departments){
            department.stringEmployees();
        }
    }

    public double calculateUniversitySalaries(){
        double salaries = 0;
        for (Department department: this.departments){
            salaries += department.getDepartmentSalary();
        }
        return salaries;
    }

    public void addDepartment(Department d){
        this.departments.add(d);
    }
}

