package test_abstract;

public class Test extends LoginAuth {

	@Override
	public void checkDBforUser() {
		System.out.println("Estou dentro do método checkDBforUser(), da classe Test, pois fui obrigado a declara-lo! :(");
	}
}
