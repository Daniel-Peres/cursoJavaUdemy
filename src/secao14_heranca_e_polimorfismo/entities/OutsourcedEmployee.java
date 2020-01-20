package secao14_heranca_e_polimorfismo.entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double aditionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = aditionalCharge;
    }

    public Double getAditionalCharge() {
        return additionalCharge;
    }

    public void setAditionalCharge(Double aditionalCharge) {
        this.additionalCharge = aditionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + additionalCharge * 1.1;

    }

}
