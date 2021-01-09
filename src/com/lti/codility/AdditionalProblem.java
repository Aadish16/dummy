package com.lti.codility;
import java.util.*;
public class AdditionalProblem {
	public int solution(int N) {
		
		if(N%2==0)
			return N-(N/2);
		else
			N=N+1;
			return N-((N/2)+1);
			
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AdditionalProblem  a = new AdditionalProblem();
		System.out.println("Enter binary String:");
		String i = sc.next();
		int j = Integer.parseInt(i,2);
		System.out.println(a.solution(j));
		
	}		
}
