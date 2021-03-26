public class ByHours extends Employee {

    private double hourPrice;
    private int workedHours;

    public ByHours(String name, String lastName, Department department, double salary) {
        super(name, lastName, department, salary);
    }


    @Override
    public double getSalary() {
        return hourPrice*workedHours;
    }

    @Override
    public String toString() {
        return super.toString()+", pago por horas.";
    }
}
