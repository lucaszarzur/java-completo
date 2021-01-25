package src;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		/* 
		  do {
		    // lógica à ser executada
		  } while (condicao)
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		do {
			nota = scanner.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				somaDasNotas += nota;
				numeroDeNotas++;
			}
		} while (nota != -1);
		
		System.out.printf("A média é %.2f", somaDasNotas / numeroDeNotas);
		
		
		// MAIS UM EXEMPLO
		System.out.println("");
		System.out.println("");
		
		int valor = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite 0 para sair ou qualquer numero para somar: ");
			valor = scanner.nextInt();
			
			soma += valor;
			System.out.println("Soma: " + soma);
		} while (valor != 0);
		
		scanner.close();
	}
}
