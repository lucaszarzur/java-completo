package src;

public class TestMain {

    public static void main(String[] args) {
        Generics_Pair<String, Integer> p1 = new Generics_OrderedPair<String, Integer>("Even", 8);
        Generics_Pair<String, String>  p2 = new Generics_OrderedPair<String, String>("hello", "world");

        // Diamond
        Generics_Pair<String, Integer> p3 = new Generics_OrderedPair<>("Even", 8);
        Generics_Pair<String, String>  p4 = new Generics_OrderedPair<>("hello", "world");

        //Parameterized Types
        // You can also substitute a type parameter (that is, K or V) with a parameterized type (that is, List<String>). For example, using the OrderedPair<K, V> example:
        Generics_OrderedPair<String, Generics_Box<Integer>> p5 = new Generics_OrderedPair<>("primes", new Generics_Box<Integer>());

        System.out.println(p1.getKey() + " - " + p1.getValue());
        System.out.println(p2.getKey() + " - " + p2.getValue());
        System.out.println(p3.getKey() + " - " + p3.getValue());
        System.out.println(p4.getKey() + " - " + p4.getValue());
        System.out.println(p5.getKey() + " - " + p5.getValue());
    }
}
