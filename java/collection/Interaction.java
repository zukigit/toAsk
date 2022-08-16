import java.util.Set;
import java.util.function.Consumer;

class Interaction {

	public static void forLoop(Set<Integer> set) {
		for(var element : set) {
			System.out.println(element);
		}
	}

	public static void forEachLoop(Set<Integer> set) {
		set.forEach(new Consumer<>() {
			public void accept(Integer data) {
				System.out.println(data);
			}
		});
	}
}