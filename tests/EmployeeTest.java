import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    private static ByHours e1;
    private static ByComision e2;
    private static BySalary e3;

    private static SabanaPayroll sabanaPayroll;



    @BeforeAll
    public static void setUp(){

        sabanaPayroll = new SabanaPayroll();

        Department VENTAS = new Department("VENTAS");
        Department FINANZAS = new Department("FINANZAS");
        Department INGENIERIA = new Department("INGERNIERIA");

        sabanaPayroll.addDepartment(VENTAS);
        sabanaPayroll.addDepartment(FINANZAS);
        sabanaPayroll.addDepartment(INGENIERIA);

        e1 = new ByHours("Justin", "Bieber", VENTAS, 50000.0);
        e2 = new ByComision("Maluma", ":v", FINANZAS, 50000.53);
        e3 = new BySalary("J", "Balvin", INGENIERIA, 5000.736);

        VENTAS.addEmployee(e1);
        FINANZAS.addEmployee(e2);
        INGENIERIA.addEmployee(e3);


    }
    @Test
    public void universitySalary(){
        assertEquals(105000, (int) sabanaPayroll.calculateUniversitySalaries());
    }


}
