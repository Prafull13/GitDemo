package com.iq.demo;

public class CountTheDuplicatesInString {

	public static void main(String[] args) {

		String str = "aaabbcddd";
		CountTheDuplicatesInString rd = new CountTheDuplicatesInString();
		rd.findDuplicate(str);
		

	}

 void findDuplicate(String str) {
		int count;
		
		char string[] = str.toCharArray();
		
		
		for(int i=0; i<string.length; i++)
		{
			count =1;
			for(int j=i+1;j<string.length;j++)
			{
				
				if(string[i] == string[j] && string[i] != ' ')
				{
					count++;
					string[j]='0';
				}
				
			}
			
			if (count > 1 && string[i] != '0')
			{
				System.out.print(string[i]);
			}
		}
	}

}