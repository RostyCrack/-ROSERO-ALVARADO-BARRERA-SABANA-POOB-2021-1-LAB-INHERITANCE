public class BySalary extends Employee {


    public double getDescuentoPension(){
        double tarifaPension = 0.04;
        return super.getSalary()* tarifaPension;

    }

    public double getDescuentoSalud(){
        double tarifaSalud = 0.04;
        return super.getSalary()* tarifaSalud;
    }

    @Override
    public double getSalary() {
        return super.getSalary()-getDescuentoPension()-getDescuentoSalud();
    }

    @Override
    public String toSring() {
        return super.toSring()+", pago por salario";
    }
}
