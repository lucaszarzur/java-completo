package exercicios.exercicios2;

import java.util.Scanner;

public class JogoAdvinhacao {

	/* Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
	 * Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas 
	 * para adivinhar o número gerado. Ao final de cada tentativa, 
	 * imprima a quantidade de tentativas restantes, e imprima se o número inserido 
	 * é maior ou menor do que o número armazenado.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		String preparado;
		int numero = 17;
		int numeroTentativasMax = 10;
		int numeroTentativa = 0;
		int tentativa = 0;
		int tentativasRestantes = 0;
		String maiorOuMenor = "";
		
		System.out.println("Olá, sem bem vindo ao jogo da advinhação!!!");
		System.out.println("\nPara começar, por favor, qual é o seu nome? ");
		nome = scanner.next();
		
		System.out.println("\nOk, " + nome + ", advinhe nosso número aleatório entre 0 e 100!");
		System.out.println("\nVocê está preparado? \nSim ou Não?");
		preparado = scanner.next().toUpperCase();
		
		switch (preparado) {
		case "SIM":
			System.out.println("\nMuito bem, vamos lá então...");
			break;
			
		case "NÃO":
			System.out.println("\nPuxa, que pena! :( quando estiver pronto, retorne.");
			break;
			
		default:
			System.out.println("\nDesculpe, opção inválida. Tente novamente!");
			System.exit(0);
			break;
		}
		
		
		do {
			
			System.out.println("\nDigite um número entre 0 e 100: ");
			tentativa = scanner.nextInt();
			numeroTentativa ++;
			tentativasRestantes = numeroTentativasMax - numeroTentativa ;

				
			if(tentativa > numero) {
				maiorOuMenor = "maior"; 
				
			} else if(tentativa < numero){
				maiorOuMenor = "menor";
				
			} else {
				maiorOuMenor = "igual ao";
				System.out.println("\nParabéns, você acertou! O número digitado (e acertado) foi " + tentativa
						+ ", o número de tentativas foi " + numeroTentativa + ", você ainda tinha " + 
						tentativasRestantes + " tentativas restantes, e o número digitado é " + maiorOuMenor + " que o "
						+ "número que você deveria advinhar.");
				System.exit(0);
			}
			
			System.out.println("\nEsta foi sua tentativa de número " + numeroTentativa + 
					", você ainda tem " + tentativasRestantes + " tentativas restantes, e o número digitado "
							+ "é " + maiorOuMenor + " que o número que você deve advinhar.");

			
		}
			while(numeroTentativa < numeroTentativasMax);
			
			if(numeroTentativa <= numeroTentativasMax) {
				System.out.println("Você perdeu!");
			} else {
				System.out.println("Parabéns, você acertou!");
			}
		}
}


