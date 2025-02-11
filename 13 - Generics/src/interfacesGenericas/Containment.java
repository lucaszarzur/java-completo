package src.interfacesGenericas;

public interface Containment<T> {
    // O método contains() verifica se um item especificado está contido dentro de um objeto que implementa Containment
    boolean contains(T o);
}
