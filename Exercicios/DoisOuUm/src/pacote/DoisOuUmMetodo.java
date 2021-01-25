package pacote;

import java.util.Scanner;

public class DoisOuUmMetodo {

	public static void main(String[] args) {

		int A = 0; // André
		int C = 0; // Carlos
		int P = 0; // Pietro

		String resultado = "";

		Scanner scanner = new Scanner(System.in);

		System.out.println("André, informe um número: ");
		A = scanner.nextInt();
		validaNumero(A);

		System.out.println("Carlos, informe um número: ");
		C = scanner.nextInt();
		validaNumero(C);

		System.out.println("Pietro, informe um número: ");
		P = scanner.nextInt();
		validaNumero(P);

		if (A != C && A != P) {
			resultado = "A";
		} else if (C != A && C != P) {
			resultado = "C";
		} else if (P != A && P != C) {
			resultado = "P";
		} else {
			resultado = "X";
		}

		System.out.println(resultado);
	}
	
	private static Boolean validaNumero(int numero) {
		Scanner scanner = new Scanner(System.in);
		boolean numeroValido = false;
		
		while (numeroValido == false) {
			if (numero < 1 || numero > 2) {
				System.out.println("Número inválido, tente novamente!");
				numero = scanner.nextInt();
			} else {
				numeroValido = true;
				return true;
			}
		}
		return false;
	}
}
