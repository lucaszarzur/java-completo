package src;

// Classe genérica simples com dois parametros de tipos: Te V.
public class TwoGen<T, V> {
    T ob1;
    V ob2;

    // Passa para o construtor referéncias a objetos de tipo Te v.
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }


    // Exibe os tipos de Te V.
    void showTypes() {
        System.out.println("Type of T is " +
                ob1.getClass().getName());

        System.out.println("Type of V is " +
                ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}

class SimpGen {
    public static void main(String[] args) {

        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");

        // Exibe os tipos
        tgObj.showTypes();

        // Obem e exibe valores
        int v = tgObj.getob1();
        System.out.println("Value: " + v);

        String str = tgObj.getob2();
        System.out.println("Value: " + str);
    }
}