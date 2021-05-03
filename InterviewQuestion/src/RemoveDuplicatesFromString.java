//public class RemoveDuplicatesFromString
//{
//	public static void main(String[] args)
//	{
//
//	String s = "Banana";
//	RemoveDuplicatesFromString s = new RemoveDuplicatesFromString();
//	 s.removeDuplicates(s); 
//
//void removeDuplicates (String s)
//
//{
//
//String [] array = s.split(s);
//String t = "" ;
// 
//for(int i=0; i<array.length; i++)
//{
//  for (int j=i+1;j<array.length;j++)
//{
//  if ( array[i] != array [j])
//  {
//		t= t+array[i];
//		System.out.println(t);
//  }
//} 
//}
//}
//



import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	void removalchar(String str) {
		String [] array = str.split(str);
		String t = "" ;
		 
		for(int i=0; i<array.length; i++)
		{
		  for (int j=i+1;j<array.length;j++)
		{
		  if (array[i] != array[j])
		  {
				t= t+array[i];
				System.out.println(t);
		  }
		}
		}
	}

	public static void main(String[] args) {

		String s = "geekofgeeks";
		RemoveDuplicatesFromString r = new RemoveDuplicatesFromString();
		r.removalchar(s);
	}

}