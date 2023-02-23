import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	
	public static void main(String[] args) {
		
		Map<String, String> m=new HashMap<String,String>();
		m.put("One", "1");
		m.put("Two", "2");
		m.put("Four", "4");
		
		
		for(String k: m.keySet()) {
			System.out.println(k);
		}
		
	}
	
	
}
