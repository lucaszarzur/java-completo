package interface_.zoo;

public class TestZoologico {
	
	public static void main(String[] args) {
		Zoo_Leao leao = new Zoo_Leao();
		Zoo_Macaco macaco = new Zoo_Macaco();
		Zoo_Lobo lobo = new Zoo_Lobo();

        // Polimorfismo em ação
		leao.fazerSom("Rawr");
		macaco.fazerSom("Uh-uh-uh");
		lobo.fazerSom( "Auuuuuu");
	}
}
