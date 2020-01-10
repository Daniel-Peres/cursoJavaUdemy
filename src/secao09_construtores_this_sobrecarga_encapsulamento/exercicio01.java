package secao09_construtores_this_sobrecarga_encapsulamento;

import secao09_construtores_this_sobrecarga_encapsulamento.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account c;

        System.out.print("Enter account number: ");
        int numero = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String opcao = sc.next();
        if(opcao.toLowerCase().charAt(0) == 'y'){
            System.out.print("Enter initial deposit value: ");
            double depInit = sc.nextDouble();
            c = new Account(numero, name, depInit);
        }else{
            c = new Account(numero, name);
        }

        System.out.println("Account data:");
        System.out.println(c);

        System.out.print("\nEnter a deposit value: ");
        double deposito = sc.nextDouble();
        c.deposito(deposito);
        System.out.println("Updated Account data:");
        System.out.println(c);

        System.out.print("\nEnter a withdraw value: ");
        double saque = sc.nextDouble();
        c.saque(saque);
        System.out.println("Updated Account data:");
        System.out.println(c);

        sc.close();
    }
}
