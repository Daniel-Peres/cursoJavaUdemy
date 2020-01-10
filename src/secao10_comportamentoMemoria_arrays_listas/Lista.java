package secao10_comportamentoMemoria_arrays_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {

        List <String> l = new ArrayList<>();
        List <String> l2 = new ArrayList<>();

        l.add("Daniel");
        l.add("Sheila");
        l.add("Pedro");
        l.add("Ryan");
        l.add("Aslam\n");

        l2.add("Daniel");
        l2.add("Sheila");
        l2.add("Pedro");
        l2.add("Ryan");
        l2.add("Aslam");
        for(String x : l){
            System.out.println(x);
        }
        for(String x : l2){
            System.out.println(x);
        }
        System.out.println("--------------------------------");

        //removendo objeto da lista
        l.remove("Aslam");

        //adicionando objeto na lista em determinada posicao
        l.add(3,"Leni");

        //removendo elemento que corresponde a determinada condicao, no caso, quarto caractere letra i
        l.removeIf(x -> x.charAt(3) == 'i');

        // tamanho da lista
        System.out.println(l.size());

        // gerando nova lista só com objetos que contem letra i como quarto caracter
        List<String> nova = l.stream().filter(x -> x.charAt(3) == 'i').collect(Collectors.toList());
        System.out.println(nova);

        // Procurando na lista objeto que contem letra i como quarto caracter
        String first1 = l.stream().filter(x -> x.charAt(3) == 'i').findFirst().orElse("Não encontrado");//encontrado
        System.out.println(first1);

        String first2 = l.stream().filter(x -> x.charAt(3) == 'a').findFirst().orElse("Não encontrado");//nao encontrado
        System.out.println(first2);

        System.out.println(l.equals(l2)); // comparando lista l e l2


//        for(String x : l){
//            System.out.println(x);
//        }
    }
}
