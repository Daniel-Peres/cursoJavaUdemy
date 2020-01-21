package secao14_heranca_e_polimorfismo.aulas.aula01_heranca.application;

import secao14_heranca_e_polimorfismo.aulas.aula01_heranca.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

        System.out.println(account.getBalance());
    }
}
