package test_interface_2;

public class CreditCard implements Payment {

	@Override
	public void makePayment() {
		// lógica de negócios própria para pagamento com CreditCard
		// por exemplo: Cartão de crédito usa número do cartão, data de expiração, CVC, etc...
		
		System.out.println("Estou no método makePayment() da classe CreditCard"); // apenas um exemplo, para sabermos onde estamos
	}
}
