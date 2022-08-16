import java.util.Map;

class MapTest {

	public static Map setData(Map<String, Integer> map) {
		for(Integer i= 10; i> 0; i--) {
			map.put(i.toString(), i);
		}

		return map;
	}
}