package src;

public class Generics_OrderedPair<K, V> implements Generics_Pair<K, V> {

    private K key;
    private V value;

    public Generics_OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}