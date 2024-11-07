package src;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		/* 
		  // for convencional
		  for (variavel x = x; x <= y; x++) {
		    // lógica à ser executada
		  }
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		double somaDasNotas = 0;
		double nota = 0;
		
		// for (inicio;     condicao; incremento)
		for (int indice = 0; indice <3; indice++) {
			nota = scanner.nextDouble();
			somaDasNotas += nota;
		}
		
		System.out.printf("A média é %.2f", somaDasNotas / 3);
		
		
		// MAIS UM EXEMPLO
		System.out.println("");
		System.out.println("");
		
		System.out.print("Ultimo numero: ");
		int numeroFinal = scanner.nextInt();
		
		// for (iniciacao; condicao; incremento)
		for (int i = 1; i <= numeroFinal; i++) {
			System.out.println(i);
		}
		
		scanner.close();




        // MAIS UM EXEMPLO
        System.out.println("");
        System.out.println("");


        double amount;
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s %n", "Year", "Amount on deposit");
        // calcula quantidade de depósito para cada um dos dez anos
        for (int year = 1; year <= 10; ++year) {
            // calcula nova quantidade durante ano especificado
            amount = principal * Math.pow(1.0 + rate, year);

            // exibe o ano e a quantidade
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}
