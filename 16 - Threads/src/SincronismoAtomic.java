package src;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/*
    Aqui é um modo mais novo da API de concorrência do Java, utilizando tipos atomicos.
    Neste exemplo é utilizado o AtomicInteger que especifica que esse valor é atomico, encapsulando a parte do sincronismo.
 */

public class SincronismoAtomic {

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
        private final AtomicInteger valor; // especifica que esse valor é atomico, encapsulando a parte do sincronismo

        public Contador() {
            this.valor = new AtomicInteger();
        }

        public void incrementar() {
            this.valor.incrementAndGet();
        }

        public int getValor() {
            return valor.get();
        }
    }
}
