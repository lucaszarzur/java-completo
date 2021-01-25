package src;

public class VariaveisEConstantes {
	
	public static void main(String[] args) {
		 double raio = 4.5;
		 final double PI = 3.1416; // constante
		 double area = PI * raio * raio;
		 
		 System.out.println("A área é " + area + " m2.");
		 
		 System.out.printf("A área é %f m2.\n", area);
		 
		 System.out.printf("A área é %.2f m2.", area);
	}

}
