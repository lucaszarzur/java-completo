package src;

import java.util.Arrays;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		
		// Incremento e decremento: ++, -- 
		num1++;
		System.out.println(num1); // 2
		--num2;
		System.out.println(num1); // 2
		
		System.out.println(++num1 == num2--); // false (3=0?)
		System.out.println(num1 == num2); // false
		
		// Complemento binário
		System.out.println(Integer.toBinaryString(50)); // 110010
		System.out.println(Integer.toBinaryString(~50)); // 11111111111111111111111111001101
		
		// Negacao
		System.out.println(!true); // false

		
		// Complementando...
		// A ordem faz diferença
		System.out.println(num3++); // 3
		System.out.println(++num3); // 5
	}
}
