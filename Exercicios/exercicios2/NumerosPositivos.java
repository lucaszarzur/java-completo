package exercicios.exercicios2;

import java.util.Scanner;

public class NumerosPositivos {

	/* Criar um programa que enquanto estiver recebendo números positivos, 
	* imprime no console a soma dos números inseridos, caso receba um número negativo, 
	* encerre o programa. Tente utilizar a estrutura do while.
	*/
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		int somadorDeNumeros = 0;
		
		while(numero >= 0) {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			
			if(numero >=0) {
				somadorDeNumeros += numero;
				System.out.println("\nA soma até o momento dos números é: " + somadorDeNumeros);
			} else {
			System.out.println("Você digitou um número negativo!");
			System.exit(0);
		}
		}
	}
}
