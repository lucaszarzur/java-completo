package exercicios.exercicios2;

import java.util.Scanner;

public class NotasParciais {

	/* Criar um programa que receba duas notas parciais, calcular a média final. 
	Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
	se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
	caso contrário imprime no console "Reprovado". 
    */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a 1ª nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Informe a 2ª nota: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		System.out.println("Sua média foi: " + media);
		
		if(media >=7) {
			System.out.println("Aprovado!");
		} else if(media >=4) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
