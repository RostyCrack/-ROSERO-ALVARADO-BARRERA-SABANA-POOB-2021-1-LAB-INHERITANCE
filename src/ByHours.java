public class ByHours extends Employee {

    private static final double HOUR_PRICE = 4.5;
    private double workedHours;

    public ByHours(String name, String lastName, Department department, double workedHours) {
        super(name, lastName, department);
        this.workedHours=workedHours;
    }


    @Override
    public double calculateSalary(){
        return this.workedHours*HOUR_PRICE;
    }

    @Override
    public String toString() {
        return super.toString()+", pago por horas.";
    }
}
