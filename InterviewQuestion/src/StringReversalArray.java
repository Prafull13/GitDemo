
public class StringReversalArray {
	
	public static void main(String[] args) {
		
		String s = "Test";
		StringReversalArray rs = new StringReversalArray();
		rs.reverseString(s);
	}

	public void reverseString(String s) {
		// TODO Auto-generated method stub
		String t=" ";
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
			
		}
		
		System.out.println(t);
		
		
	}

}
