package secao05_estruturaCondicional.exercicios;

// Exercicio 1046 do site UriJudgeOnline

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int a = 0, b = 0, duracao = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if(b < a || b == a) b += 24;


        duracao = b - a;

        if (duracao >= 1 && duracao <= 24){
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        }
        sc.close();
    }
}
