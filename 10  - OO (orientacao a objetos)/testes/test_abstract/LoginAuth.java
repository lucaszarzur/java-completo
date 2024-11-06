package test_abstract;

public abstract class LoginAuth {
	public String encryptPassword(String pass) {
		
		// Implemente aqui o mesmo compartamento que será compartilhado por todas as subclasses

		System.out.println("Estou dentro do método encryptPassword(), o qual ficará apenas aqui na classe LoginAuth!");
		return "";
	}

	// Cada subclasse precisa providenciar sua própria implementação do método abaixo:
	public abstract void checkDBforUser();
}
