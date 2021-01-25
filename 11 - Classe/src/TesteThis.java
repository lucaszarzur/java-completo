package classe;

public class TesteThis {

	public static void main(String[] args) {

		This pessoa = new This();

		pessoa.nome = "Lucas";
		pessoa.idade = 23;
		pessoa.nacionalidade = "Brasileira";
		pessoa.exibirPessoa();
		
		System.out.println("");

		This pessoa2 = new This("Debora", 23, "Argentina");
		pessoa2.exibirPessoa();

	}
}
