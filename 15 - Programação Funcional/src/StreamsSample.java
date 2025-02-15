package src;

import java.util.Arrays;
import java.util.List;

public class StreamsSample {

    public static void main(String[] args) {

        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        final List<Integer> onlyEvenNumbers = numbers.stream()
                .filter(x -> x % 2 == 0)
                .toList();

        System.out.println(onlyEvenNumbers);
    }
}
