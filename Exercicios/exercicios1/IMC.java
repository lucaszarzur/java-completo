package exercicios.exercicios1;

import java.util.Scanner;

public class IMC {

	// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o seu peso: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Informe sua altura: ");
		double altura = scanner.nextDouble();
		
		double IMC = peso / (altura * altura);
		
		System.out.printf("Sua altura é %.2f, seu peso é %.2f e seu IMC é %.2f.", altura, peso, IMC);
		
		scanner.close();
		
	}
}
