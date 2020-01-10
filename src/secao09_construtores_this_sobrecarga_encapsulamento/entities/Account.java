package secao09_construtores_this_sobrecarga_encapsulamento.entities;

public class Account {
    private int numeroConta;
    private String name;
    private double saldo;

    public Account() {}

    public Account(int numeroConta, String name, double initDeposit) {
        this.numeroConta = numeroConta;
        this.name = name;
        deposito(initDeposit);
    }

    public Account(int numeroConta, String name) {
        this.numeroConta = numeroConta;
        this.name = name;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double deposito){
        this.saldo += deposito;
    }

    public void saque(double saque){
        this.saldo -= saque + 5.00;
    }

    @Override
    public String toString() {
        return "Account "
                + numeroConta
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f",saldo);
    }
}
