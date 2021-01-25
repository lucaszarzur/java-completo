package src;

public class OperadoresComparacaoIgualdade {
	
	public static void main(String[] args) {
		
		// Comparação: > (maior), >= (maior ou igual), < (menor), <= (menor ou igual)
		// Igualdade: == (igual) e != (diferente)
		int num1 = 97;
		int num2 = 'b';
		
		System.out.println(num1 == num2); // false
		System.out.println(3 != 2); // true
		System.out.println(3 >= 2); // true
		System.out.println(3 > 2); // true
		System.out.println(3 <= 3); // true
		System.out.println(3 < 4); // true
		
		
		// EXEMPLO BLOQUEADO?
		System.out.println("");
		System.out.println("");
		
		boolean bloqueado = false;
		
		System.out.println(!bloqueado); // true
	}
}
