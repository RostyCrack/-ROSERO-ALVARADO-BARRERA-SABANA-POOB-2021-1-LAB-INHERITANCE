public class ByHours extends Employee {

    private double hourPrice;
    private int workedHours;


    @Override
    public double getSalary() {
        return hourPrice*workedHours;
    }
}
