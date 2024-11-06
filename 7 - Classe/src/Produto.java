package src;

public class Produto {

	String nome;
	double preco;
	
	// variavel "desconto" de instancia
	// double desconto;
	
	// variavel "desconto" de classe
	static double desconto;
	
	Produto() {
		
	}
	
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;

	}
	
	double precoComDesconto() {
		return preco - preco * desconto;
	}
}
