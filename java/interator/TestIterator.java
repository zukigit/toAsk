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
				// i.remove();  //next() method က collection ထဲမှာရှိတဲ့ element ကိုပါဖျက်ပေးတာတွေ့ရပါတယ်ဗျ။
						//so why do we need remove() moethods ser, i read doc but didn't understand clearly ser! pls tell me, why do we still need remove() method.
				i.next();
			}
			count++;
		}
	}
}
