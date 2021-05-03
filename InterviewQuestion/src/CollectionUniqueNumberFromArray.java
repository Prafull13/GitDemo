import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionUniqueNumberFromArray {
	
	
	public static void main(String[] args) {
		
		
//		int a[] = {'4','5','6','2','4','6','9','4','6','8','4','6','4'};
		int a[] = {4,5,5,5,4,4,6,6,7,7,7,7,7,7};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<a.length;i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					k++;
				}
			}
			
			System.out.println(a[i]+"==>"+k);
//			System.out.println(k);
			
//			System.out.println("Digit"+ a[i]+ "present times ==>");
//			System.out.print(k);
		}	
		
	}
	}
}
