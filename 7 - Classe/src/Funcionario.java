package src;

public class Funcionario {

	String nome;
	int salario;
	String funcao;
	
	// construtor padrão
	Funcionario(){
		
	}
	
	Funcionario(String n, int s, String f){
		nome = n;
		salario = s;
		funcao = f;
	}
	
	String exibir(){
		return String.format(nome + "\n" + salario + "\n" + funcao);
	}
	
}
