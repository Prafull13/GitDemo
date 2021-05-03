package com.iq.demo;

public class Palindrom {

	public static void main(String agrs[]) {

		String s = "racecar1";
		String t = "";

//		for(int i = s.length() - 1; i >= 0; i--) 
		for(int i=s.length()-1;i>=0;i--)
		{
			t = t + s.charAt(i);
		}
		System.out.println(t);
		if (s.equalsIgnoreCase(t)) {
			System.out.println("palindrom");

		} else {
			System.out.println("not palindrom");
		}

	}
}