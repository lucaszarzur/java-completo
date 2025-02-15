package src;

import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        final List<String> names = List.of("arthur", "maria", "jose", "jaum");

        final var name = "someone";

        System.out.println(name.toUpperCase());

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
