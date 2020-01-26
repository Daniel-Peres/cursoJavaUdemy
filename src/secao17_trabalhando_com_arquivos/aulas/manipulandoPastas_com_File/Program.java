package secao17_trabalhando_com_arquivos.aulas.manipulandoPastas_com_File;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for(File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for(File file : files){
            System.out.println(file);
        }

        System.out.print("\nDeseja criar ou remover uma subpasta no caminho especificado(c / r)? ");
        char resposta = sc.next().toLowerCase().charAt(0);

        if(resposta == 'c'){
            System.out.print("Digite nome da subpasta a ser criada: ");
            String nomePasta = sc.next();
            boolean success = new File(strPath + "\\"+ nomePasta).mkdir();
            System.out.println("Directory created successfully: " + success);
        }else{
            System.out.print("Digite nome da subpasta a ser removida: ");
            String nomePasta = sc.next();
            boolean remove = new File(strPath + "\\" + nomePasta).delete();
            System.out.println("Directory removed successfully: " + remove);
        }
        sc.close();
    }
}
