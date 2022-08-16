import java.util.Deque;
import java.util.function.Consumer;

class QueueTest{

	public static void innerLoop(Deque<String> deque) {
		deque.forEach(new Consumer<>(){
			public void accept(String data) {
				System.out.println(data);
			}
		});
	}

	public static void outerLoop(Deque<String> deque) {
		for(String data: deque) {
			System.out.println(data);
		}
	}

	public static void whileLoop(Deque<String> deque) {
		while(deque.peekFirst() != null) {
			System.out.println(deque.pollFirst());
		}
	}
}