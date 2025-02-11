package src.exemploPraticoFila;

public class GenQueue<T> implements IGenQ<T>{
    private T q[]; // array que contém a fila
    private int putloc, getloc; // índices de inserção e retirada

    // Constrói uma fila vazia com o array dado
    public GenQueue(T[] aRef) {
        this.q = aRef;
        putloc = getloc = 0;
    }

    // Insere um item na fila
    @Override
    public void put(T obj) throws QueueFullException {
        if (putloc == q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = obj;
    }

    // Retira um item da fila
    @Override
    public T get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }
}
