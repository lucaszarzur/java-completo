package src;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!"); // BOM DIA SENHORA!!!
		
		System.out.println(s);
		
		String x = "Lucas".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
		
		String s2 = "Bom dia ?".toUpperCase().replace("?", "Bia").concat("!");
		System.out.println(s2);
	}
}
