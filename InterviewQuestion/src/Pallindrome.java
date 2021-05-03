
public class Pallindrome {
	
	public static void main(String [] args)
	{
		String s="racecar";
		String t="";
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			t= t+s.charAt(i);
		}
		
		if (s.equalsIgnoreCase(t))
				{System.out.println("Yes Pallindrom");}
		else
		{
			System.out.println("Not Pallindrom");
		}
			
		
	}

}
