public class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

	public K getKey() {
		return this.key;
	}

	public V getValue() {
		return this.value;
	}

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return ("Key: " + this.key + " Value: " + this.value);
    }

    
}
