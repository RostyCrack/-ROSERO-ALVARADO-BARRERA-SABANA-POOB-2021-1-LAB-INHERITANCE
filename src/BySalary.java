public class BySalary extends Employee {

    private static final double tarifaPension = 0.04;
    private static final double tarifaSalud = 0.04;

    public BySalary(String name, String lastName, Department department, double salary) {
        super(name, lastName, department, salary);
    }

    public double getDescuentoPension(){
        return super.getSalary()* tarifaPension;

    }

    public double getDescuentoSalud(){
        return super.getSalary()* tarifaSalud;
    }

    @Override
    public double getSalary() {
        return super.getSalary()-getDescuentoPension()-getDescuentoSalud();
    }

    @Override
    public String toString() {
        return super.toString()+", pago por salario";
    }
}
