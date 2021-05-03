package com.iq.demo;

class RemovingDuplicatesSimple {


    public static void main(String[] args) {

    	String ip = "AAAB";
    	int count =0;

        String op = "";
        for (int i = 0; i < ip.length(); i++) 
        
        {
//            if (ip.charAt(i % ip.length()) != ip.charAt((i + 1) % ip.length())) 
            if(ip.charAt(i % ip.length()) != ip.charAt((i+1) % ip.length()))
    		{

                op += ip.charAt(i);


            }
        }
        System.out.println(count + op);
    }

}

//9923110930