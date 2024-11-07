package controle;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
        // FOR
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }

            System.out.println(i); // não executará o número 2
        }

        System.out.println("Fim");


        // WHILE
        int count = 0;
        while (count < 10) {
            //count++;

            if (count % 2 == 0) {
                break; // pula a impressão quando count é par
            }

            System.out.println("Número ímpar: " + count);
        }

		System.out.println("Fim");
	}
}
