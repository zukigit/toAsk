class WildCard {
	public static void main(String[] args) {
		Container<?> c;
		c = new Container<String>();

		Container<? extends CharSequence> c1;
		c = new Container<String>();
	}
}

class Container<T> {


}