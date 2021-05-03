
public class TestBack {
	
	public static void main(String[] args) {
		String s="This is the string for a Test mechanism";
//		String t= null;
		int vowels=0;
		
//		for(int i=s.length()-1; i>=0;i--)
//		{
//			t=t+s.charAt(i);
//			
//		}
//		System.out.println(s);
		
		s=s.toLowerCase();
		for(int i=0; i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='a')
			{
				vowels++;
			}
		}
		
		System.out.println("String Contains number of vowels =>" + vowels );
	}

}
