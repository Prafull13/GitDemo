
public class CheckConsonants {
	
	
	public static void main(String[] args) {
		
		String s = "This Is1to $% check Consonents";
		
		CheckCharacterType(s);
	}

	private static void CheckCharacterType(String s) {
		int consonants= 0;
		int vowels=0;
		int digit=0;
		int spaces=0;
		int specialChar=0;
		
		for(int i=0;i<s.length();i++)
		{
			s = s.toLowerCase();
			char ch = s.charAt(i);
			
		if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		 {
			 vowels++;
		 }
		else if (( ch >= 'a' && ch <='z') || (ch >= 'A' && ch <='Z'))
		 {
			 consonants++;
		 }
		 else if(ch >='0' && ch <='9')
		 {
			 digit++;
		 }
		 else if (ch == ' ')
		 {
			 spaces++;
		 }else
	            specialChar++; 
		
		}
		
		System.out.println("Number of Characters in the String "+s+"are::" +s.length());
		System.out.println("Number of vowels::"+vowels);
		System.out.println("Number of consonants::"+consonants);
		System.out.println("Number of digit::"+digit);
		System.out.println("Number of spaces::"+spaces);
		System.out.println("Number of specialChar::"+specialChar);
	}

}
