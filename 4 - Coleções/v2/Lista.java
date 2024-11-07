package src;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        // sem tamanho fixo adicionado
        ArrayList<String> letras1 = new ArrayList<String>();
        letras1.add("A");
        letras1.add("B");
        letras1.add("C");

        // com tamanho fixo adicionado
        List<String> letras2 = new ArrayList<String>(3);
        letras2.add("D");
        letras2.add("E");
        letras2.add("F");



        // herdando de outra lista
        ArrayList<String> letras3 = new ArrayList<String>(letras1);
        letras3.add("X");
        letras3.add("Y");
        letras3.add("Z");

        System.out.println(letras3.contains("Lucas"));


        System.out.println("Letras1:");
        for (int i = 0; i < letras1.size(); i++) {
            System.out.println(letras1.get(i));
        }

        System.out.println("\nLetras2:");


        for (int i = 0; i < letras2.size(); i++) {
            System.out.println(letras2.get(i));
        }

        System.out.println("\nLetras3:");
        for (int i = 0; i < letras3.size(); i++) {

            System.out.println(letras3.get(i));
        }

	}
}
