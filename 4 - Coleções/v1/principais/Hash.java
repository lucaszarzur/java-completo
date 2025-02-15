package v1.principais;

import dto.Usuario;

import java.util.HashMap;
import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {

        HashMap<Integer, Usuario> alunos = new HashMap<>();
        alunos.put(123, new Usuario("Pedro"));
        alunos.put(1234, new Usuario("Ana"));

        HashSet<Usuario> usuarios = new HashSet<Usuario>();
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		boolean resultado = usuarios.contains(new Usuario("Guilherme"));
		System.out.println(resultado);
	}
}
