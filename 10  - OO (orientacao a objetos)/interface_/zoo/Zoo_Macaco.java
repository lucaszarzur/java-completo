package interface_.zoo;

public class Zoo_Macaco implements AnimalInterface {
	
    @Override
    public void fazerSom(String som) {
        System.out.println("Estou no Zoo_Macaco. O som é: " + som);
    }
}
