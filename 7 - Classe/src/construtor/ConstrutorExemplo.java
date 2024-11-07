package src.construtor;

public class ConstrutorExemplo {

    private String modelo;
    private int ano;

    public ConstrutorExemplo() {
        System.out.println("\nConstrutor padrão chamado!");
    }

    public ConstrutorExemplo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        System.out.println("\nConstrutor parametrizado chamado!");
    }

    public void mostrarInformacoes() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }
}
