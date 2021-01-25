package src;

public class IfElse {

	public static void main(String[] args) {
		
		/* 
		  if..else
		  if (condicao) {
		    // lógica à ser executada
		  } else {
		    // lógica à ser executada
		  }
		*/
		
		double nota = 7.5;
		
		if(nota >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		} else {
			System.out.println("Recuperação!");
			System.out.println("Estude mais da próxima vez!");
		}
	}
}
