package src;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		/* 
		  // for convencional
		  for (variavel x = x; x <= y; x++) {
		    // lógica à ser executada
		  }
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		double somaDasNotas = 0;
		double nota = 0;
		
		// for (iniciacao; condicao; incremento)
		for (int indice = 0; indice <3; indice++) {
			nota = scanner.nextDouble();
			somaDasNotas += nota;
		}
		
		System.out.printf("A média é %.2f", somaDasNotas / 3);
		
		
		// MAIS UM EXEMPLO
		System.out.println("");
		System.out.println("");
		
		System.out.print("Ultimo numero: ");
		int numeroFinal = scanner.nextInt();
		
		// for (iniciacao; condicao; incremento)
		for (int i = 1; i <= numeroFinal; i++) {
			System.out.println(i);
		}
		
		scanner.close();
	}
}
