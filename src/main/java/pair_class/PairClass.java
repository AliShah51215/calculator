package pair_class;

public class PairClass<K, V> {
    private final K key;
    private final V value;

    public PairClass(K key, V value) {
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

