package interface_.zoo;

public class Zoo_Leao implements AnimalInterface {

    @Override
    public void fazerSom(String som) {
        System.out.println("Estou no Zoo_Leao. O som é: " + som);
    }
}
