package src;

import java.util.stream.IntStream;

/*
    Aqui é um modo "antigo" porém que funciona bem de se tratar a concorrência que é:
     - Utilizando a declaração "volatile" a qual especifica que esse valor é volatil, ou seja, ele sofre de concorrência;
     - Utilizando a declaração "synchronized" garante que apenas uma thread tenha acesso ao trecho de código a qual está declarada de cada vez
 */

public class SincronismoSyncronized {

    public static void main(String[] args) throws InterruptedException {
        final var contador = new Contador();

        final var t1 = new Thread(new Tarefa(contador));
        t1.start();

        final var t2 = new Thread(new Tarefa(contador));
        t2.start();

        final var t3 = new Thread(new Tarefa(contador));
        t3.start();

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
        private volatile int valor; // especifica que esse valor é volatil, ou seja, ele sofre de concorrência

        public Contador() {
            this.valor = 0;
        }

        public synchronized void incrementar() {
            this.valor++;
        }

        public int getValor() {
            return valor;
        }
    }
}
