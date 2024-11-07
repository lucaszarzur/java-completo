package src;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Tipo primitivo booleano
        System.out.println("Tipo primitivo booleano");
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b\n", bo1, bo2); // false true
		
		// Tipo primitivo caracter
        // Tabela ASCII https://www.asciitable.com/
        System.out.println("\nTipo primitivo caracter");
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		System.out.printf("%c %c %c\n", c1, c2, c3);
		System.out.println(c1+ 0);

        // EXEMPLO 2
        char o = 111;
        char ii = 105;

        char interrogacao = 0x00E1;

        System.out.println("" + o + ii + interrogacao);

		// Tipos primitivos inteiros
        System.out.println("\nTipos primitivos inteiros");
		byte b = 127;
		short s = 32767;
		int i = 2_147_483_647;
		long l = 9_223_372_036_854_775_807L;
		System.out.printf("%d %d %d %d\n", b, s, i, l);
//		System.out.println(Integer.toBinaryString(b));
//		System.out.println(Integer.toBinaryString(s));
//		System.out.println(Integer.toBinaryString(i));
//		System.out.println(Long.toBinaryString(l));
		
		// Tipos primitivos reais (ponto flutuante)
        System.out.println("\nTipos primitivos reais (ponto flutuante)");
		float f = 3.1416F;
		double d = 2.45;
		System.out.printf("%.2f %.1f", f, d);
		
		
		// MAIS EXEMPLOS
        System.out.println("\n\nMais exemplos");

		long populacaoUberlandia = 650000;
		System.out.println(populacaoUberlandia);
		
		long populacaoMundial = 7000000000L;
		System.out.println(populacaoMundial);
		
		float saldoConta = 1030.43F;
		System.out.println(saldoConta);
	}
}
