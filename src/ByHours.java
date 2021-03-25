public class ByHours extends Employee {

    private double hourPrice;
    private int workedHours;


    @Override
    public double getSalary() {
        return hourPrice*workedHours;
    }

    @Override
    public String toSring() {
        return super.toSring()+", pago por horas.";
    }
}
