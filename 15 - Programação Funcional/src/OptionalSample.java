package src;

import java.util.Optional;

public class OptionalSample {

    public static void main(String[] args) {

        final Optional<String> optional = Optional.ofNullable(null);
        final Optional<String> optional2 = Optional.ofNullable("lucas");

//        ERRADO! NAO FAZER ASSIM!
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

        optional.map(String::toUpperCase)
                .ifPresent(System.out::println);

        optional2.map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}
