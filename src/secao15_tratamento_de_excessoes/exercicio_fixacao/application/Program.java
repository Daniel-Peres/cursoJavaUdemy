package secao15_tratamento_de_excessoes.exercicio_fixacao.application;

import secao15_tratamento_de_excessoes.exercicio_fixacao.model.entities.Account;
import secao15_tratamento_de_excessoes.exercicio_fixacao.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double amount = sc.nextDouble();
         try {
             acc.withdraw(amount);
             System.out.print("New balance: " + String.format("%.2f", acc.getBalance()));
             sc.close();
         } catch (DomainException e) {
             System.out.println("Withdraw error: " + e.getMessage());
         }
    }
}