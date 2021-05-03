
public class ReverseP {
	
	public static void main(String[] args) {
		
		
//		String s="tadam";
//		String t="";	
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			t=t+s.charAt(i);
//		}
//			if(s.equalsIgnoreCase(t)) {
//				System.out.println("Pallindrom");
//			}else {
//				System.out.println("Not Pallindrome");
//			}
		
		String s="This is Test for coding";
		int vowels=0;
		
		s=s.toLowerCase();
		
		for(int i=0; i<s.length();i++)
		{
			char ch = s.charAt(i);

			if(ch == 'a' || ch == 'e'|| ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
		}
		System.out.println(vowels);
		
		
		
	}

}
