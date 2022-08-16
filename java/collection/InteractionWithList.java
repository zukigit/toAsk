import java.util.List;
import java.util.function.Consumer;

class Interaction {

	public static void innerForLoop(List<Integer> list) {
		list.forEach(new Consumer<>(){
			public void accept(Integer data) {
				System.out.println(data);
			}
		});
	}

	public static void outerForLoop(List<Integer> list) {
		for(Integer element : list) {
			System.out.println(element);
		}
	}

	public static void generalLoop(List<Integer> list) {
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
