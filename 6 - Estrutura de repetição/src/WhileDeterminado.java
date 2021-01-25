package src;

import java.util.Scanner;

public class WhileDeterminado {
	
	/* 
	  while (condicao) {
	    // lógica à ser executada
	  }
	*/
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double somaDasNotas = 0;
		double nota = 0;
		
		int indice = 0;
		while (indice < 3) {
			nota = scanner.nextDouble();
			somaDasNotas += nota;
			indice++;
		}
		
		System.out.printf("A média é %.2f", somaDasNotas / 3);
	
		
		// MAIS UM EXEMPLO
		System.out.println("");
		System.out.println("");
	
		System.out.print("Digite o numero inicial: ");
		int numeroInicial = scanner.nextInt();
		
		System.out.print("Digite o numero final: ");
		int numeroFinal = scanner.nextInt();
		
		int numeroAtual = numeroInicial;
		
		while (numeroAtual <= numeroFinal) {
			System.out.println(numeroAtual);
			numeroAtual++;
		}
		
		scanner.close();
	}
}
