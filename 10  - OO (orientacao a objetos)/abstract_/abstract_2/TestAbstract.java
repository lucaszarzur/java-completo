package abstract_.abstract_2;

public class TestAbstract {

    public static void main(String[] args) {
        Animal animal = new Cachorro();
        System.out.println("Respira: " + animal.respirar());
        System.out.println("Se move: " + animal.mover());


    }
}
