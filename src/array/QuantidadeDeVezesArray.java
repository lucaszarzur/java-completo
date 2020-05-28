package array;

import java.util.ArrayList;
import java.util.List;

public class QuantidadeDeVezesArray {

	public static void main(String[] args) {
		
		// Array contendo: 2, 3, 4, 3, 2, 1
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		
		int inteiro = 2; // numero que se quer obter
		int count = 0; // contador
		
		// varrendo a array
		for (int inteiroo : arr) {
			if (inteiroo == inteiro) {
				count = count + 1;
			}
		}
		System.out.println(count); // imprime quantidade
	}
}
