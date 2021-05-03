import java.util.Arrays;

public class ConvertStringIntoCharArry {
	
	
	public static void main(String[] args) {
		
		String str1 = "nanaunababa";
		String str2 = "banananaba";
		
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();
		
//		System.out.println(str);
		
		if(str1.length() == str2.length())
		{
		
		char[] chararray1 = str1.toCharArray();
		char[] chararray2 = str2.toCharArray();
		
		Arrays.sort(chararray1);
		Arrays.sort(chararray2);
		

		boolean result = Arrays.equals(chararray1, chararray2);
		if (result)
		{
			System.out.println("Anagram");
			}
		else 
		{
			System.out.println(" Not Anagram");
		}
		}

		
	}

}
