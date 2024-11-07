package interface_.zoo;

public class Zoo_Lobo implements AnimalInterface {

    @Override
    public void fazerSom(String som) {
        System.out.println("Estou no Zoo_Lobo. O som é: " + som);
    }
}
