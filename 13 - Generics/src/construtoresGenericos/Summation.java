package src.construtoresGenericos;

public class Summation {
    private int sum;

    // Construtor genérico
    // pode ser construído com o uso de qualquer tipo numérico, inclusive Integer, Float ou Double.
    <T extends Number> Summation(T arg) {
        sum = 0;

        for(int i=0; i<=arg.intValue(); i++) {
            sum +=1;
        }
    }

    public int getSum() {
        return sum;
    }
}

class GenConsDemo {
    public static void main(String[] args) {
        Summation ob = new Summation(4.0);

        System.out.println("Summation of 4.0 is " + ob.getSum());
    }
}