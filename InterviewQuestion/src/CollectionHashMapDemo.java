import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionHashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Akash");
		hm.put(2, "Vinod");
		hm.put(3, "Yogesh");
		hm.put(4, "Nishant");
		hm.put(5, "Krishna");
//		System.out.println(hm);
		
		Set shmes = hm.entrySet();
//		System.out.println(shmes);
		
		Iterator it = shmes.iterator();
		
		
		while(it.hasNext())
		{
//			System.out.println(it.next());
			

			Map.Entry mp = (Map.Entry) it.next();

		System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
			
		}
		
		
	}

}
