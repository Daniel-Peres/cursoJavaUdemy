package secao18_interfaces.aulas.solucao_de_um_problema.sem_interface.model.services;

public class BrazilTaxService {

    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        }
        else {
            return amount * 0.15;
        }
    }
}