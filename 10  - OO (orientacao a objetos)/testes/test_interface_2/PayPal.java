package test_interface_2;

public class PayPal implements Payment {

	@Override
	public void makePayment() {
		// lógica de negócios própria para pagamento no PayPal
		// por exemplo: PayPal usa nome do usuário, e senha para pagamento
		
		System.out.println("Estou no método makePayment() da classe PayPal"); // apenas um exemplo, para sabermos onde estamos
	}
}
