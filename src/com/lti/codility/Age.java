package com.lti.codility;

public class Age {

	String[] sortbyAge(String []input)
	{
		String temp;
		for(int i=0; i<input.length;i++)
		{
			String s[]= input[i].split("-");
			for(int j= i+1; j<input.length;j++)
			{
				String s1[]= input[j].split("-");
				if(Integer.parseInt(s[1])>Integer.parseInt(s1[1]))
				{
				temp= input[i];
				input[i]=input[j];
				input[j]=temp;
				}
			}
		}
			return input;
			
			
		}
		public static void main(String[] args) {
			String input[]= {"Ben-23","Tim-19","Tom-34"};
			String[]res = new Age().sortbyAge(input);
			
			for(String k: res)
				System.out.println(k);
			

	}
}
