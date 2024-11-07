package abstract_.abstract_2;

public abstract class Animal {

    public String respirar() {
        return "Usando Oxigênio";
    }

    public abstract String mover(); // inacabado, devido ao uso de 'abstract' também no método. Digamos que eu 'não sei' como implementar para todos, deixo a responsabilidade para quem herdar
}
