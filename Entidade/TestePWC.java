package Entidade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestePWC {

    public static void main(String[] args) {
        TestePWC teste = new TestePWC();

        
        System.out.println("");

        System.out.println("Exercicio 01 - Reverter a ordem das palavra nas frases");
        System.out.println("Dados do teste: Hello, Word! OpenAl is amazing");
        System.out.println("Saida: " + teste.reverterOrdemDasPalavras("Hello, Word! OpenAl is amazing"));
        
        System.out.println("");

        System.out.println("Exercicio 02 - remover duplicados");
        System.out.println("Dados do teste: Hello, Word!");
        System.out.println("Saida: " + teste.removerDuplicado("Hello, Word!"));

        System.out.println("");

        System.out.println("Exercicio 03 - Substring palindroma mais longa");
        System.out.println("Dados do teste: babad");
        System.out.println("Saida: " + teste.palindromaMaisLonga("babad"));

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

    public String removerDuplicado(String frase) {
        StringBuffer concatenarBuffer = new StringBuffer();
        frase.chars().distinct().forEach(letra -> concatenarBuffer.append((char) letra));
        System.out.println(concatenarBuffer.toString());
        return concatenarBuffer.toString();
    }

    
    public String palindromaMaisLonga(String texto) {

        List<Character> listaDosCaracteres = new ArrayList<>();
        texto.chars().forEach(letra -> listaDosCaracteres.add((char) letra));
        StringBuffer StringFinal = new StringBuffer();

        Integer quantidadeDeCaracter = listaDosCaracteres.size();

        for (int i = 0; i < quantidadeDeCaracter; i++) {
            StringFinal.append(listaDosCaracteres.get(i));
            if (i > 1 && StringFinal.toString()
                    .equals(new StringBuffer()
                            .append(StringFinal.toString()).reverse().toString())) {

                return StringFinal.toString();

            }
        }
        return "Não é palindroma";

    }

    
    
    

    
}
