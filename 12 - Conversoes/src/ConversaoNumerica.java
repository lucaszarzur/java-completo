package src;

public class ConversaoNumerica {

	public static void main(String[] args) {
		
		float f = (float) 0.1; // explícita (CAST)
		System.out.println(f);
		
		int i1 = (int) 7.9; // explícita (CAST)
		System.out.println(i1);
		
		int i2 = 'a'; // implicita
		System.out.println(i2);
		
		double d = 1001; // implicita
		System.out.println(d);
	}
}
