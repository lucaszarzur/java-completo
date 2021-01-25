package exercicios.exercicios2;

import java.util.Scanner;

public class Numero0e10Par {

	// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		double numero;
		
		System.out.println("Olá, sem bem-vindo ao programa que receberá um número e verificará se ele está "
				+ "entre 0 e 10 e é par!\n");
		
		System.out.println("Para começar, digite seu nome: ");
		nome = scanner.next();
		
		//System.out.println("\n\nOlá, " + nome + "! Qual é o número que você deseja verificar?");
		System.out.println("\nOlá, " + nome + "! Qual é o número que você deseja verificar?");
		numero = scanner.nextDouble();
		
		System.out.println("\nOk, vamos verificar o número " + numero + " para você...");
		
		if (numero >= 0 && numero <=10) {
			if(numero % 2 == 0) {
			System.out.println("\nPelas minhas contas, o número " + numero + " é par!");
			
			} else  {
			System.out.println("Verificamos que o número " + numero + " não é par, é impar!");
			}
		} else {
			System.out.println("Desculpe, o número " + numero + " não está entre 0 e 10 e é inválido! Por favor, tente com outro número!");
		}
		
		scanner.close();
		
		}
	}
