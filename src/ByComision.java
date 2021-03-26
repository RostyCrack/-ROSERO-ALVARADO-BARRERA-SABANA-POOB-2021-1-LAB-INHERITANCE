public class ByComision extends Employee{

    private int soldProducts;
    private double comision;

    public ByComision(String name, String lastName, Department department, double salary) {
        super(name, lastName, department, salary);
    }


    @Override
    public double getSalary() {
        return soldProducts*comision;
    }

    @Override
    public String toString() {
        return super.toString()+", pago por comision.";
    }
}



