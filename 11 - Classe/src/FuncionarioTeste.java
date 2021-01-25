package src;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();

			funcionario.nome = "Lucas";
			funcionario.salario = 2000;
			funcionario.funcao = "Analista de Suporte";

			//System.out.printf(funcionario.nome + funcionario.salario + funcionario.funcao);
			
			System.out.println(funcionario.exibir());
			
			
		Funcionario funcionario2 = new Funcionario("Debora",1500,"Tradutora de espanhol");
		
			System.out.println(funcionario2.exibir());
		
		}
	}

