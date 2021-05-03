
public class StringClassDemo {
	
	
	public static void main(String args[])
	{
//		StringClassDemo scd = new StringClassDemo();
		String a = "      *Hello /Java&Training&InProgrss";
//		a.charAt(2);
//		System.out.println(a.charAt(0));
//		System.out.println(a.indexOf('o'));
//		
//		System.out.println(a.substring(5, 9));
//		System.out.println(a.substring(5));
//		System.out.println(a.concat(" Prafull Teaches "));
//		System.out.println(a.toUpperCase());
//		System.out.println(a.toLowerCase());
		System.out.println(a.trim());
		
		String arr[] = a.split("/");
		System.out.println(arr[1]);
		System.out.println(a.replace("&", " "));
		
	}

}
