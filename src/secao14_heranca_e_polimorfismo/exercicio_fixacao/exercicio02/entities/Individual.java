package secao14_heranca_e_polimorfismo.exercicio_fixacao.exercicio02.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if(getAnualIncome() <= 20000.00){
            return (getAnualIncome() * 15/100) - (healthExpenditures * 50/100);
        }else {
            return (getAnualIncome() * 25/100) - (healthExpenditures * 50/100);
        }
    }
}
