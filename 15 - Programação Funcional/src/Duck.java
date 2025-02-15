package src;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    public static void main(String[] args) {

        final Duck duck = new Duck("Duck");
        final Animal meoTwo = new Animal("Meo Two");

        final Walk walking = animal -> "%s is walking".formatted(animal.getName());

        System.out.println(walking.walk(duck));
        System.out.println(walking.walk(meoTwo));
    }
}
