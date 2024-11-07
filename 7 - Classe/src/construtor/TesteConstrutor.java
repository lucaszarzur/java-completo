package src.construtor;

public class TesteConstrutor extends  Object {

    public static void main(String[] args) {
        ConstrutorExemplo construtorExemplo = new ConstrutorExemplo();
        construtorExemplo.mostrarInformacoes();

        ConstrutorExemplo construtorExemplo2 = new ConstrutorExemplo("Fusca", 1970);
        construtorExemplo2.mostrarInformacoes();
    }
}
