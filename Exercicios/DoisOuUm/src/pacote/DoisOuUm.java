package pacote;

import java.util.Scanner;

public class DoisOuUm {

	public static void main(String[] args) {

		int A = 0; // André
		int C = 0; // Carlos
		int P = 0; // Pietro

		String resultado = "";

		Scanner scanner = new Scanner(System.in);

		System.out.println("André, informe um número: ");
		A = scanner.nextInt();
		while (A < 1 || A > 2) {
			System.out.println("Número inválido, tente novamente!");
			A = scanner.nextInt();
		}

		System.out.println("Carlos, informe um número: ");
		C = scanner.nextInt();
		while (C < 1 || C > 2) {
			System.out.println("Número inválido, tente novamente!");
			C = scanner.nextInt();
		}

		System.out.println("Pietro, informe um número: ");
		P = scanner.nextInt();
		while (P < 1 || P > 2) {
			System.out.println("Número inválido, tente novamente!");
			P = scanner.nextInt();
		}

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
}
