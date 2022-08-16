import java.util.ArrayDeque;

class BalancedString {

	public static boolean check(String string) {
		char[] cString = string.toCharArray();
		var storedOpens = new ArrayDeque<Character>();

		for(char check : cString) {

			if(BalancedString.isOpen(check)) {
				storedOpens.add(check);
				continue;
			}

			if(storedOpens.isEmpty()) {
				return false;
			}

			char tem = storedOpens.pollLast();

			if(tem == '{' && check != '}') {
				return false;
			} else if(tem == '[' && check != ']') {
				return false;
			} else if(tem == '(' && check != ')') {
				return false;
			}
		}

		return cString.length == 0 && storedOpens.isEmpty();
	}

	public static boolean isOpen(char string) {
		return string == '{' || string == '(' || string == '[';
	}
}