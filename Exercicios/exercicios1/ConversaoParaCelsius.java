package exercicios.exercicios1;

import java.util.Scanner;

public class ConversaoParaCelsius {

	// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
	
	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		
		double conversao = (fahrenheit -32 ) * 5 / 9; 
		
		System.out.println("Valor em Celsius: " + conversao);
		
		scanner.close();
		
	}
}
