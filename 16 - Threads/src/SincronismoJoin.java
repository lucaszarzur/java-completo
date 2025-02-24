package src;

import java.util.stream.IntStream;

/*
    O ".join()" espera que uma thread finalize por completo para outra entre em execução, ou seja, se em uma corrida colocássemos
    um join enfileirando cada competidor, apenas 1 correria por vez e quando o primeiro chegasse ao fim ai sim teríamos o segundo correndo,
    depois o terceiro... Teríamos previsibilidade de quem vai terminar primeiro pois eles correriam em sequência.

    Logo, não temos uma concorrência (por consequencia um sincronismo) de fato. Isso impede que as threads sejam executadas simultaneamente.
 */

public class SincronismoJoin {

    public static void main(String[] args) throws InterruptedException {
        final var contador = new Contador();

        final var t1 = new Thread(new Tarefa(contador));
        t1.start();
        t1.join(); // Espera esta thread terminar para que seja possível iniciar a próxima

        final var t2 = new Thread(new Tarefa(contador));
        t2.start();
        t2.join(); // Espera esta thread terminar para que seja possível iniciar a próxima

        final var t3 = new Thread(new Tarefa(contador));
        t3.start();
        t3.join(); // Espera esta thread terminar para que seja possível iniciar a próxima

        Thread.sleep(3000);

        System.out.println(contador.getValor());
    }

    public static class Tarefa implements Runnable {

        private final Contador contador;

        public Tarefa(Contador contador) {
            this.contador = contador;
        }

        @Override
        public void run() {
            IntStream.rangeClosed(1, 1000).forEach(valor -> this.contador.incrementar());
        }
    }

    private static final class Contador {
        private int valor;

        public Contador() {
            this.valor = 0;
        }

        public void incrementar() {
            this.valor++;
        }

        public int getValor() {
            return valor;
        }
    }
}
