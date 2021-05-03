package com.iq.demo;

public class Findrepeter {
	
	void Findrepeter(String s){
	    int distinct = 0 ;

	    for (int i = 0; i < s.length(); i++) {

	        for (int j = 0; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	                distinct++;

	            }
	        }   
	        System.out.print(s.charAt(i)+""+distinct);
	        
	        
	        String d=String.valueOf(s.charAt(i)).trim();
	        s=s.replaceAll(d,"");
	        distinct = 0;

	    }

	}
	
	public static void main(String[] args) {
		
		String str = "mmababctamantlslmag"; 
		Findrepeter r = new Findrepeter(); 
        r.Findrepeter(str); 
		
	}

}
