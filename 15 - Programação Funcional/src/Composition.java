package src;

import java.util.function.Function;

public class Composition {

    public static void main(String[] args) {

        final Function<Integer, Integer> multiplyByTwo = x -> x * 2;
        final Function<Integer, Integer> addThree = x -> x + 3;

        final Function<Integer, Integer> multiplyAndAdd = multiplyByTwo.andThen(addThree);

        System.out.println(multiplyAndAdd.apply(5));
    }
}
