package Pratica;

public class CanetaTeste {

	public static void main(String[] args) {

		System.out.println("Caneta 1...");
		Caneta caneta = new Caneta();
		caneta.nome = "Bic";
		caneta.exibirCaneta();

		System.out.println("Caneta 2...");
		Caneta caneta2 = new Caneta("Lucas");
		caneta2.exibirCaneta();

		
		System.out.println("Caneta 3...");
		Caneta caneta3 = new Caneta();
		caneta3.nome = "Teste";
		caneta3.exibirCaneta();
	}
}
