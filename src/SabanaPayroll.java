import java.util.ArrayList;

public class SabanaPayroll {

    private ArrayList<Department> departments;

    public void printPayRoll(){
        for (int i = 0; i<departments.size(); i++){
            departments.get(i).getEmployee();

        }
    }
}

