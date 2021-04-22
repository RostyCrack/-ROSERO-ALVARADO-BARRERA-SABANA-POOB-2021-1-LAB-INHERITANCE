import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    private static ByHours e1;
    private static ByComision e2;
    private static BySalary e3;

    private static SabanaPayroll sabanaPayroll;

    private static Department VENTAS;
    private static Department FINANZAS;
    private static Department INGENIERIA;



    @BeforeAll
    public static void setUp(){

        sabanaPayroll = new SabanaPayroll();

        VENTAS = new Department("VENTAS");
        FINANZAS = new Department("FINANZAS");
        INGENIERIA = new Department("INGERNIERIA");

        sabanaPayroll.addDepartment(VENTAS);
        sabanaPayroll.addDepartment(FINANZAS);
        sabanaPayroll.addDepartment(INGENIERIA);


        e1 = new ByHours("Justin", "Bieber", VENTAS, 78);
        e2 = new ByComision("Maluma", ":v", FINANZAS, 6389);
        e3 = new BySalary("J", "Balvin", INGENIERIA, 5000);

        VENTAS.addEmployee(e1);
        FINANZAS.addEmployee(e2);
        INGENIERIA.addEmployee(e3);


    }

    @Test
    public void calculateEmployeeSalary(){
        assertEquals(351, sabanaPayroll.calculateEmployeeSalary(e1.getId()));
        assertEquals(25556, sabanaPayroll.calculateEmployeeSalary(e2.getId()));
        assertEquals(4600.0, sabanaPayroll.calculateEmployeeSalary(e3.getId()));

    }

    @Test
    public void universitySalary(){
        assertEquals(30507, (int) sabanaPayroll.calculateUniversitySalaries());
        sabanaPayroll.printPayroll();
    }





}
