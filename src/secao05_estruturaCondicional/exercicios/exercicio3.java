package secao05_estruturaCondicional.exercicios;

import java.util.Scanner;

// Exercicio 1044 do site UriJudgeOnline

public class exercicio3 {
    public static void main(String[] args) {
        int a,b,maior,menor;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if(a > b){
            maior = a;
            menor = b;
        }else{
            maior = b;
            menor = a;
        }
        if(maior%menor == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
