import java.util.*;

class Test {

	public static void main(String[] args) {
		
	}
}

// class GenericMethod {

// 	public static <T> GenericClass<T> generateObj(T type) {
// 		return new GenericClass(type);
// 	}
// }

class GenericClass<T> {
	
	private T input;
	@SuppressWarnings("unchecked")
	private T[] database =(T[]) new Object[0];
	
	public Boolean addData(T input) {
		database = Arrays.copyOf(database, database.length + 1);
		database[database.length - 1] = input;
		return true;
	}

	public int showLength() {
		return database.length;
	}
}