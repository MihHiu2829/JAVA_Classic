package Box;

public class dictionary<K,V> {
    private K Key ;
    private V value ;

    public dictionary(K key, V value) {
        Key = key;
        this.value = value;
    }

    public K getKey() {
        return Key;
    }

    public void setKey(K key) {
        Key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
