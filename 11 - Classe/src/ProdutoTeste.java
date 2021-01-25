package src;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		
		produto1.nome = "Notebook Acer 15' 8GB";
		produto1.preco = 2300;
		// dando o valor "0.15" à variavel desconto de instancia
		produto1.desconto = 0.15;
		
		Produto produto2 = new Produto("Caneta BIC Preta", 2.83);
		
		// dando o valor "0.15" à variavel desconto de classe
		Produto.desconto = 0.15;
		
		System.out.println(produto1.precoComDesconto());
		System.out.println(produto2.precoComDesconto());
	}
}
