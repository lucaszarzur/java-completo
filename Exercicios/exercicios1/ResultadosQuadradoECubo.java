package exercicios.exercicios1;

import java.util.Scanner;

public class ResultadosQuadradoECubo {

	// Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = scanner.nextDouble();
		
		double quadrado = valor * valor;
		double cubo = valor * valor * valor;
		
		// Tambem pode ser usado o Math.pow(valor, QtdeVezesASerElevado)
		// Exemplo : double cubo2 = Math.pow(valor, 3);
		
		System.out.printf("O valor digitado foi %.2f\n"
				+ "seu valor ao quadrado é %.2f\n"
				+ "seu valor ao cubo é %.2f"
				, valor, quadrado, cubo);
		
	}
}
