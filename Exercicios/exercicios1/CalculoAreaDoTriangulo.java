package exercicios.exercicios1;

import java.util.Scanner;

public class CalculoAreaDoTriangulo {

	// Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a base do triângulo: ");
		double base = scanner.nextDouble();
		
		System.out.println("Digite a altura do triângulo: ");
		double altura = scanner.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A área do triângulo é: " + area);
	}
}
