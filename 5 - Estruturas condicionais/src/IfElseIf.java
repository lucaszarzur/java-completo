package src;

public class IfElseIf {

	public static void main(String[] args) {
		
		/* 
		  if..else if
		  if (condicao) {
		    // lógica à ser executada
		  } else if (condicao) {
		    // lógica à ser executada
		  }
		*/
		
		double nota = 2.5;
		
		if(nota >= 9) {
			System.out.println("Quadro de honra!");
		} else if(nota >= 7) {
			System.out.println("Aprovado!");
		} else if(nota >= 5.5) {
			System.out.println("Recuperação!");
		} else if(nota >= 3.5) {
			System.out.println("Recuperação + Trabalho!");
		} else {
			System.out.println("Reprovado!");
		}
	}
}
