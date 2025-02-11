package src.interfacesGenericas;

// Implementa Containment usando um array para amarzenar os valores
public class MyClass<T> implements Containment<T> { // Toda classe que implemente uma interface genérica também deve ser genérica
    T[] arrayRef;

    public MyClass(T[] o) {
        this.arrayRef = o;
    }

    // Implementa contains()
    @Override
    public boolean contains(T o) {
        for(T x: arrayRef)
            if (x.equals(o)) return true;
        return false;
    }
}
