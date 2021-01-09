package com.lti.codility;

public class PrimeIndex {
	
	
	   static boolean isPrime(int n) {
	     
	     
	        if (n <= 1) return false; 
	      
	       
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	      
	        return true; 
	    } 
	      
	   
	   static void prime_index(String input) 
	    { 
	        int n = input.length();  
	         
	        for (int i = 2; i <= n; i++)  
	            if (isPrime(i))  
	  
	                System.out.print 
	                (input.charAt(i - 1));          
	    } 
	      
	   
	    public static void main (String[] args) 
	    { 
	        String input = "123456789"; 
	          
	        prime_index(input); 
	    } 
	} 
	  
