
public class ReverserProgram {

	public static void main(String[] args) {
		
		String s="rahul is real man";
		String t= "";
		int vowels=0;
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
	
		}
		
		System.out.println(vowels);
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			t=t+s.charAt(i);
//		}
//		System.out.println(t);
	}
	
}
