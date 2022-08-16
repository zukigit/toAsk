class GenericMethod {

}

class GenerateClass {

	public static <K extends CharSequence, V extends Number> Pair<K, V> generate(K key, V value) {
		return new Pair(key, value);
	}
}

class Pair<K, V> {

	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public void show() {
		System.out.printf("K: %s ; V: %s%n", key, value);
	}
}