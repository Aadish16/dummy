package com.lti.codility.TimeComplexity;
import java.util.*; 

  
public class  PermMisssingElem { 
    public static void countCurrency(int amount) 
    { 
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 }; 
        int[] noteCounter = new int[9];
        
        for (int i = 0; i < 9; i++) { 
            if (amount >= notes[i]) { 
                noteCounter[i] = amount / notes[i]; 
                amount = amount - noteCounter[i] * notes[i]; 
            } 
        } 
       
       
        System.out.println("Currency Count ->"); 
        for (int i = 0; i < 9; i++) { 
            if (noteCounter[i] != 0) { 
                System.out.println(notes[i] + " : "
                    + noteCounter[i]); 
            } 
        } 
    } 
      
 
    public static void main(String argc[]){ 
        int amount = 868; 
        countCurrency(amount); 
    } 
}

