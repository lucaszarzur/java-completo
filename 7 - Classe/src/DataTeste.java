package src;

public class DataTeste {

	public static void main(String[] args) {
		
		//classe nomeObjeto = atribuir Construtor Data()
		Data nascimento = new Data();
		
		// a partir do objeto "nascimento" chama as variaveis dia, mes e ano da classe Data
		nascimento.dia = 19;
		nascimento.mes = 11;
		nascimento.ano = 1987;
		
		// chama o metodo formatar() para exibir os dados
		System.out.println(nascimento.formatar());
		
		
		
		//System.out.println(nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano);
		//System.out.printf("%d/%d/%d", nascimento.dia, nascimento.mes, nascimento.ano);
	
		//classe nomeObjeto = atribuir Construtor Data(parametros de entrada)
		Data casamento = new Data(8, 9, 2010);
		
		System.out.println(casamento.formatar());
	
	}
}
