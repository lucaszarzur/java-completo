package src;

@FunctionalInterface
public interface Walk {

    String walk(Animal animal);

    default String walkFast(Animal animal) {
        return walk(animal) + " fast";
    }
}
