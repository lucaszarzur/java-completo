package src;

public class Metodos {

	/*
	 * METODOS Métodos são blocos reutilizáveis de código que você pode escrever uma
	 * vez e executá-lo de novo e de novo, eliminando a necessidade de repetir o
	 * código todas as vezes.
	 * 
	 * Isso é realmente útil. Há várias formas de se definir métodos, mas, por
	 * agora, vamos nos concentrar em um tipo simples.
	 * 
	 * Aqui nós definimos um método usando a palavra reservada public(um dos
	 * modificadores de acesso), seguida do tipo (void, String, customizado...) e de
	 * um nome, com parênteses colocados na sequência. Depois disso nós colocamos
	 * duas chaves ({ }). Dentro das chaves vai todo o código que queremos executar
	 * sempre que chamarmos o método.
	 * 
	 * 
	 * Sintaxe: acesso tipo nome(parametro1, parametro2...) { // logica }
	 */

	public static void main(String[] args) {

		System.out.println(soma(2, 2));

		System.out.println(retornaSexo("F"));
		
		System.out.println(retornaMaiorQue10(5));
	}

	// usamos a palavra reservada static para que o método possa ser acessivel
	// dentro da mesma classe
	public static int soma(int numero1, int numero2) {
		int resultado = numero1 + numero2;

		return resultado;
	}

	public static String retornaSexo(String sexo) {
		// M, F
		// Masculino, Feminino

		if (sexo == "M") {
			return "Masculino";
		} else if (sexo == "F") {
			return "Feminino";
		} else {
			return "Outro";
		}
	}

	public static String retornaMaiorQue10(int numero) {
		if (numero > 10) {
			return "Sim";
		} else if (numero <= 10) {
			return "Nao";
		} else {
			return "O valor informado nao é um numero";
		}
	}
}
