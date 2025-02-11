package src;

// Classe genérica simples. Aqui, T é um parâmetro de tipo que será substituído pelo tipo real quando um objeto de tipo Gen for criado.
public class Gen<T> {
    T ob; // declara um objeto de tipo T

    // construtor
    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        // INTEGER
        // Cria um objeto Gen para Integers
        Gen<Integer> iOb;

        // Cria um objeto Gen<Integer> e atribui sua  referência a iOb. Observe o uso do autoboxing no encapsulamento do valor 88 dentro de um objeto Integer.
        iOb = new Gen<Integer>(88);

        // Exibe o tip de dado usado por iOb
        iOb.showType();

        // Obtém o valor de iOb. Observe que nenhuma coerção é necessária
        int v = iOb.getOb();
        System.out.println("Value: " + v);


        System.out.println();


        // STRING
        // Cria um objeto Gen para Strings
        Gen<String> strOb = new Gen<String>("Generics Test");

        // Exibe o tip de dado usado por iOb
        strOb.showType();

        // Obtém o valor de iOb. Observe que nenhuma coerção é necessária
        String str = strOb.getOb();
        System.out.println("Value: " + str);

    }
}


