package test_abstract;

public class Main {

	public static void main(String[] args) {
		
		// Chamando as implementações da classe abstrata
		LoginAuth auth = new Test();
		auth.encryptPassword(null);
		auth.checkDBforUser();
	}
}
