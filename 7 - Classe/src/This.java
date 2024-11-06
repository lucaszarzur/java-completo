package classe;

public class This {

	String nome;
	int idade;
	String nacionalidade;

	This() {

	}

	/*
	 * o uso do this nesse caso, informa que o valor passado a variavel do metodo,
	 * será incluido na variavel de mesmo nome, na variavel da classe.
	 * 
	 * Sem o uso do this, o metodo "exibirPessoa()" nao conseguiria mostrar os
	 * valores atribuidos aqui, isto porque ele referencia as variaveis da classe, e
	 * aqui, antes do this, estava referenciando a ele mesmo.
	 */
	This(String nome, int idade, String nacionalidade) {
		this.nome = nome;
		this.idade = idade;
		this.nacionalidade = nacionalidade;
	}

	void exibirPessoa() {
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(nacionalidade);
	}
}
