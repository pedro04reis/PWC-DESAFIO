package Entidade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestePWC {

    public static void main(String[] args) {
        TestePWC teste = new TestePWC();

        
        System.out.println("");

        System.out.println("Exercicio 01 - Reverter a ordem das palavra nas frases, mantendo a ordem das palavras");
        System.out.println("Valor inserido: Hello, Word! OpenAl is amazing");
        System.out.println("Valor de Saida: " + teste.reverterOrdemDasPalavras("Hello, Word! OpenAl is amazing"));
        
        System.out.println("");



        
    }

    public String reverterOrdemDasPalavras(String frase) {
        
        String[] textoSeparado = frase.split(" ");
        List<String> arrayDoSplit = new ArrayList<>(Arrays.asList(textoSeparado));
        StringBuffer concatenar = new StringBuffer();
        int size = arrayDoSplit.size();
        int iterador = size - 1;
        for (int i = iterador; i >= 0; i--) {
            concatenar.append(arrayDoSplit.get(i) + " ");
            

        }
        return concatenar.toString();
    }

    
    

    
}
