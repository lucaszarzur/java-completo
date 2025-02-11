package src.exemploPraticoFila;

public class GenQDemo {
    public static void main(String[] args) {
        // Cria uma fila de inteiros
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of Integers");
        try {
            for(int i=0; i<5; i++) {
                System.out.println("Adding " + i + " to q.");
                q.put(i); // adiciona o valor inteiro à q
            }
        } catch (QueueFullException ex) {
            System.out.println(ex);
        }

        System.out.println();

        try {
            for(int i=0; i<5; i++) {
                System.out.println("Getting next Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException ex) {
            System.out.println(ex);
        }

        System.out.println();



        // Cria uma fila Double
        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<>(dStore);

        Double dVal;

        System.out.println("Demonstrate a queue of Doubles");
        try {
            for(int i=0; i<5; i++) {
                System.out.println("Adding " + (double)i/2 + " to q2.");
                q2.put( (double)i/2); // adiciona o valor double à q2
            }
        } catch (QueueFullException ex) {
            System.out.println(ex);
        }

        System.out.println();

        try {
            for(int i=0; i<5; i++) {
                System.out.println("Getting next Double from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException ex) {
            System.out.println(ex);
        }
    }
}
