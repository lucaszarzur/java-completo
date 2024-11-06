package src.veiculos;

// Essa classe declara um objeto de tipo Veiculo.
public class VeiculoTeste {
    public static void main(String args[]) {
        Veiculo minivan = new Veiculo(); // delcaração do tipo de Veiculo
        int range;

        // atribui valores a campos de minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // calcula a autonomia presumindo um tanque cheio de gasolina
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);


    }
}
