package com.lti.codility;
import java.util.ArrayList;
public class Vowels {
	static char[] moveVowels(char[] input) {
		ArrayList<Character> v1 = new ArrayList<Character>();
		ArrayList<Character> v2 = new ArrayList<Character>();
		for (char ch: input) {
			if (Character.toLowerCase(ch) =='a'||
				Character.toLowerCase(ch) =='e'||
				Character.toLowerCase(ch) =='u'||
				Character.toLowerCase(ch) =='o'||
				Character.toLowerCase(ch) =='i' )
			{
				v1.add(ch);
			}else {
				v2.add(ch);
			}
		}
		v1.addAll(v2);
		int count = 0;
		
		 for (Character in:v1) {
			 input[count++] = in.charValue();
		 }
		return input;
		
	}
	
	public static void main(String[]Args) {
		char[] input = {'q','w','a','e','f','i','c','t'};
		;
		for(char i : Vowels.moveVowels(input))
			 System.out.println(i);
	}
}
