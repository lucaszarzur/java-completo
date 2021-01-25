package src;

public class Array {

	public static void main(String[] args) {
		
		//forma de declarar uma array já com os dados
		double[] notasJoao = {7.0, 8.7, 6.2, 4.9, 9.7};
		
		//outra forma de criar o array...
		double [] notasPedro = new double[5]; // nesse caso cria como um objeto e aponta a qtde de dados
		notasPedro[0] = 7.0;
		notasPedro[1] = 8.7;
		notasPedro[2] = 6.2;
		notasPedro[3] = 4.9;
		notasPedro[4] = 9.7;
		
		double totalJoao = 0;
		
		for(int i = 0; i < notasJoao.length; i++) {
			totalJoao += notasJoao[i];
		}
		
		/* for(each)
		for(double nota: notasJoao) {
			totalJoao += nota;
		}
		*/
		
		double totalPedro = 0;
		
		for (int i =0; i < notasPedro.length; i++) {
			totalPedro += notasPedro[i];
		}
		
		/* for(each)
		for(double nota: notasPedro) {
			totalPedro +=nota;
		}
		*/
		
		System.out.println(totalJoao / notasJoao.length);
		System.out.println(totalPedro / notasPedro.length);
	}
}
