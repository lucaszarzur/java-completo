package testes.test_extends_classe;

public class Cachorro extends Animal {

	void cadastrarCachorro(String nome, String raça, String cor, int idade) {
		setNome(nome);
		setRaça(raça);
		setCor(cor);
		setIdade(idade);
		
		System.out.println("Ótimo, seu animal foi cadastrado!");
		System.out.println("\n Segue os dados dele:"
				+ "\n Nome: " + nome
				+ "\n Raça: " + raça
				+ "\n Cor: " + cor
				+ "\n Idade: " + idade);
	}
}
