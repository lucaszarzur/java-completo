package src;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		
	}
	
	
	Data(int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
	}
	//metodo formatar que recebe uma String e nao retorna nenhum tipo especifico
	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}


	public char[] obterDataFormatada() { // vai estourar o temido "NullPointerException"
		return null;
	}
}
