package src;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

		/*
		 * switch (variavel) { case 'A': // lógica à ser executada se for 'A'
		 * 
		 * case 'B': // lógica à ser executada se for 'B'
		 * 
		 * default: // lógica à ser executada se não for nenhuma das opções }
		 */

		String conceito = "";
		int nota = 5;

		switch (nota) {
		case 10:
		case 9:
			conceito = "A";
			break;
		case 8:
		case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "C";
			break;
		case 4:
		case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
		case 0:
			conceito = "E";
			break;
		default:
			conceito = null;
			break;
		}

		if (conceito != null) {
			System.out.println("Conceito " + conceito);
		} else {
			System.out.println("Nota inválida.");
		}

		// EXEMPLO IPVA
		System.out.println("");
		System.out.println("");
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o final da placa: ");
		int finalPlaca = entrada.nextInt();

		switch (finalPlaca) {
		case 1:
			System.out.println("Vencimento dia 11 de Janeiro");
			break;
		case 2:
			System.out.println("Vencimento dia 12 de Janeiro");
			break;
		default:
			System.out.println("Vencimento sem data, desculpe");
		}
	}
}
