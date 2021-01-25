package src;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		
		// +, -, *, /, %
		int soma = num1 + num2 + num3 + 6;
		System.out.println(soma); // 18
		System.out.println(num1 - num2 - num3); // -6
		
		// Cuidado com a precedência
		System.out.println(num1 + num3 * num2 / 2); // 13
		System.out.println((num1 + num3) * num2 / 2); // 16
		
		// Resto da divisão
		System.out.println(10 % 3); // 1
		
		
		// EXEMPLO NOTAS ESCOLARES
		System.out.println("");
		System.out.println("");
		
		int notaAluno1 = 99;
		int notaAluno2 = 80;
		int notaAluno3 = 53;
		
		System.out.println("Nota aluno 1: " + notaAluno1 +
						   "\nNota aluno 2: " + notaAluno2 +
						   "\nNota aluno 3: " + notaAluno3);
		
		System.out.println("");
		
		int totalGeral = notaAluno1 + notaAluno2 + notaAluno3;
		System.out.println("Total geral: " + totalGeral);
		
		int mediaGeral = (notaAluno1 + notaAluno2 + notaAluno3) / 3;
		System.out.println("Media geral: " + mediaGeral);
	}
}
