package secao06_estruturasRepetitivas.estruturaRepetitivaWhile;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        int senhaCorreta = 2002;
        int senha = 0;
        Scanner sc = new Scanner(System.in);

        while(senha != senhaCorreta){
            senha = sc.nextInt();
            if(senha == senhaCorreta) System.out.println("Acesso Permitido");
            else System.out.println("Senha Invalida");
        }
        sc.close();
    }
}
