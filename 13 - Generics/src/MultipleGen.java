package src;

public class MultipleGen<I, N, S, A> {
    I id;
    N nome;
    S salario;
    A alocado;

    public MultipleGen(I id, N nome, S salario, A alocado) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.alocado = alocado;
    }

    // Exibe os tipos
    void showTypes() {
        System.out.println("Type of I is " +
                id.getClass().getName());

        System.out.println("Type of N is " +
                nome.getClass().getName());

        System.out.println("Type of S is " +
                salario.getClass().getName());

        System.out.println("Type of A is " +
                alocado.getClass().getName());
    }

    I getId() {
        return id;
    }

    N getNome() {
        return nome;
    }

    S getSalario() {
        return salario;
    }

    A getAlocado() {
        return alocado;
    }
}

class TestMultiple {
    public static void main(String[] args) {
        MultipleGen<Integer, String, Double, Boolean> funcionario = new MultipleGen<>(1, "Lucas", 5.000, true);

        // Exibe os tipos
        funcionario.showTypes();

        // Obem e exibe valores
        int v = funcionario.getId();
        System.out.println("Value: " + v);

        String str = funcionario.getNome();
        System.out.println("Value: " + str);

        Double doub = funcionario.getSalario();
        System.out.println("Value: " + doub);

        boolean alocado = funcionario.getAlocado();
        System.out.println("Value: " + alocado);
    }
}