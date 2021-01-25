package exercicios.exercicios2;

import java.util.Scanner;

public class AnoBissexto {

	// Criar um programa informa se o ano atual é um ano bissexto; 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int anoAtual;
		
		
		System.out.println("Qual é o ano atual? ");
		anoAtual = scanner.nextInt();
		
		if(anoAtual % 4 == 0) {
			System.out.println("\nO ano " + anoAtual + " É um ano bissexto!");
		} else {
			System.out.println("\nO ano " + anoAtual + " NÃO É um ano bissexto!");
		}
		
		scanner.close();
	}
}
