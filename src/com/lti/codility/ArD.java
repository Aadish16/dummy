
package com.lti.codility;
import java.util.Arrays;
public class ArD {
	int[] swapSort(int input[]) {
		int targ[] = new int[input.length];
		int rev=0;
		int digit, num=0;
		for(int i=0; i<input.length; i++)
		{
			num=digit=rev=0;
			num=input[i];
			while(num!=0) {
				digit= num%10;
				rev=rev*10 + digit;
				num=num/10;
			}
			targ[i]=rev;
		}
		Arrays.sort(targ);
		return targ;
	}
	public static void main(String[] args) {
		ArD s= new ArD();
		int input[]= {12,34,35,16,19,27};
		int[]result =s.swapSort(input);
		for(int r: result) {
			System.out.println(r);
		}		
	
	}
}
