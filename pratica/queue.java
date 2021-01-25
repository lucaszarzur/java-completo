package Pratica;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
//		fila.offer("Lucas");
		fila.add("Debora");
		
		
		System.out.println("Peek...");
		System.out.println(fila.peek());
		
		//pula linha
		System.out.println("");
		
		System.out.println("Poll...");
		System.out.println(fila.poll());
		
		//pula linha
		System.out.println("");
		
		System.out.println("Remove...");
		System.out.println(fila.remove());
	}

}
