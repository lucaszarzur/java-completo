package testes.test_interface;

public class DBOracle implements LoginAuth {
	
	// Precisa implementar os dois métodos da classe "LoginAuth"

	@Override
	public String encryptPassword(String pass) {
		return pass; // apenas um exemplo, para sabermos onde estamos
	}

	@Override
	public void checkDBforUser() {
		System.out.println("Estou no DBOracle, executando o segundo método! :)"); // apenas um exemplo, para sabermos onde estamos
	}
}
