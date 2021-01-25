package test_interface;

public interface LoginAuth {

	// Declaração dos dois métodos à serem utilizados pelas implementações de banco de dados
	
	public String encryptPassword(String pass);

	public void checkDBforUser();

}
