import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashTest {

	public static void main(String[] args) {
		
		//Creating map
		Map<Integer, String> m=new HashMap<Integer,String>();
		
		//Adding values
		m.put(102, "One Hundred Two");
		m.put(103, "One Hundred Three");
		m.put(100, "One Hundred");
		m.put(101, "One Hundred One");
		
		m.put(101,"My new value");
		
	
		
		
		//Getting values	
		System.out.println(m.get(102));
		
		
		
		
		
		
		
		
		
		//Getting all the keys
		
		Set<Integer> s=m.keySet();
		
		for(int i:s) {
			
			System.out.println(i);
			
		}
		
		
		
		
		
		
		
		//Getting all values
		Collection<String> c=m.values();
		
		for(String s1:c) {
			
			System.out.println(s1);
			
		}	
		

	}

}
