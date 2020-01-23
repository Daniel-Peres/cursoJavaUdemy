package secao14_heranca_e_polimorfismo.exercicio_fixacao.exercicio02.entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if(numberOfEmployees <= 10){
            return getAnualIncome() * 16/100;
        }else {
            return getAnualIncome() * 14/100;
        }
    }
}
