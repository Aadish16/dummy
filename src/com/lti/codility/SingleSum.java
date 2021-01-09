package com.lti.codility;

public class SingleSum {
	static int Sum(int n) 
    { 
        int sum = 0; 
        while(n>0 ||sum>9)  
        { 
            if (n == 0) { 
               n = sum; 
               sum = 0; 
            } 
            sum= sum+ n % 10; 
            n=n/10; 
        } 
        return sum; 
    } 
      
 public static void main(String argc[])  { 
        int n = 6754; 
        System.out.println(Sum(n)); 
    } 
} 
