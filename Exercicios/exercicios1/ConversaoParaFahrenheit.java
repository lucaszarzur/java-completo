package exercicios.exercicios1;

import java.util.Scanner;

public class ConversaoParaFahrenheit {

	// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
			
		double conversao = celsius * 9 / 5 + 32;
			
		System.out.print("Valor em Farenheit: \n" + conversao);
			
		scanner.close();
		
		
	}
}
