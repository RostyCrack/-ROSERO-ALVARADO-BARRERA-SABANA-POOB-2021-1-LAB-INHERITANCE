public class ByComision extends Employee{

    private int soldProducts;
    private double comision;


    @Override
    public double getSalary() {
        return soldProducts*comision;
    }

    @Override
    public String toSring() {
        return super.toSring()+", pago por comision.";
    }
}



