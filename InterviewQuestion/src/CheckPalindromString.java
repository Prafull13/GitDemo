
public class CheckPalindromString {
	
	public static void main(String[] args) {
		
		String s = "Racecar";
		CheckPalindromString cp = new CheckPalindromString();
		cp.CheckPalindromString (s);
		
		
	}

	public void  CheckPalindromString(String s) {
		// TODO Auto-generated method stub
	
		String t="";
		s = s.toLowerCase();
		for(int i=s.length()-1;i>=0;i--)
		{	
		
			t=t+s.charAt(i);
		}
		if (s.equalsIgnoreCase(t))
		{
			System.out.println("Palindrom");
		}else
		{
			System.out.println("Not Palindrom");
		}
	}
}
