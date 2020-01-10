package secao10_comportamentoMemoria_arrays_listas.matriz;

import java.util.Scanner;

public class exercicioMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] mat = new int [n][n];

        for(int i =0; i < mat.length; i++){
            for(int j =0; j < mat.length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for(int i =0; i < mat.length; i++){
                System.out.print(mat[i][i] + " ");

        }
        int count = 0;
        for(int i =0; i < mat.length; i++){
            for(int j =0; j < mat.length; j++){
                if(mat[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.println("\nNegative numbers = " + count);



        sc.close();
    }
}



