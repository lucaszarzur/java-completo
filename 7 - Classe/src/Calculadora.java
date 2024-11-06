package src;

public class Calculadora {

	double resultado;
	
	// entrada, processamento e saida
	double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}
	
	// entrada, processamento
	void acrescentar(double a) {
		resultado += a;
	}
	
	// processamento e saida
	double obterResultado() {
		return resultado;
	}
	
	// processamento
	void limpar() {
		resultado = 0;
	}
}
