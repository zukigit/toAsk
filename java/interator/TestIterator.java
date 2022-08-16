import java.util.Collection;
import java.util.Iterator;

class TestIterator {

	public static void deleteCollection(Collection<?> collection) {

		System.out.println("Before delete");
		for(var data : collection) {
			System.out.println(data);
		}


		Iterator<?> i = collection.iterator();
		int count = 1;

		while(i.hasNext()) {
			// i.next();
			if(count % 2 == 0) {
				// i.remove();
				i.next();
			}
			count++;
		}
	}
}