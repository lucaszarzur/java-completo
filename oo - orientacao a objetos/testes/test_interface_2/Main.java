package test_interface_2;

public class Main {
	
	public static void main(String[] args) {
		
		// Chamando as implementações da interface
		Payment payment = new PayPal();
		payment.makePayment();
		
		Payment payment2 = new CreditCard();
		payment2.makePayment();
	}
}
