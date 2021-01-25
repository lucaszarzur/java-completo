package test_interface;

public class Main {

	public static void main(String[] args) {
		
		// Chamando as implementações da interface
		LoginAuth auth_DBMySQL = new DBMySQL();
		auth_DBMySQL.encryptPassword(null);
		auth_DBMySQL.checkDBforUser();
		
		LoginAuth auth_DBOracle = new DBOracle();
		auth_DBOracle.encryptPassword(null);
		auth_DBOracle.checkDBforUser();
		
		LoginAuth auth_DBAbc = new DBAbc();
		auth_DBAbc.encryptPassword(null);
		auth_DBAbc.checkDBforUser();
	}
}
