import java.util.ArrayList;

public class CollectionUniqueCharFromArray {

	public static void main(String[] args) {

		char a[] = { 'a', 'a', 'c', 'c', 'c', 'd' };
//		int a[] = {4,5,5,5,4,4,6,6,7,7,7,7,7,7};
		ArrayList<Character> al = new ArrayList<Character>();
//		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) 
					{
						k++;
					}
				}
//				System.out.println(a[i]+"==>"+k);
				if(k==1)
				{
					System.out.println(a[i] + "is the unique character/number");
				}
			}
			
		}
		

	}

}