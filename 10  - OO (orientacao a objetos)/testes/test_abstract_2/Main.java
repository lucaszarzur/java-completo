package testes.test_abstract_2;

public class Main {
	
	public static void main(String[] args) {
		
		// Chamando as implementações da classe abstrata
		
		Burger vegBerger = new VegBerger();
		vegBerger.price(10.50);
		
		Burger nonVegBerger = new NonVegBerger();
		nonVegBerger.price(8.50);
	}
}
