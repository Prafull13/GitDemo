import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterator {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101, "Praf1");
		hm.put(102, "Praf2");
		hm.put(103, "Praf3");
		hm.put(104, "Praf4");
		
		System.out.println(hm);
		
		Set sn = hm.entrySet();
		
		Iterator it = sn.iterator();
		
		while(it.hasNext())
		{
			
		Map.Entry mp = (Map.Entry) it.next();
		System.out.print(mp.getKey());
		System.out.print(mp.getValue());
			
		}
		
		
		
		
	}

}
