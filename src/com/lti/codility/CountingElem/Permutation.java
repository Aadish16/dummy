package com.lti.codility.CountingElem;
import java.util.*;
public class Permutation {
	static int checkPermute(int[] N) {
		Set<Integer> ts= new TreeSet <Integer>();
		Set<Integer> ps= new TreeSet<Integer>();
		for (int i=0; i<N.length; i++) {
			ts.add(N[i]);
			ps.add(i+1);
			
		}
		for(int vals:ps) {
			if(!its.contains(vals))
				return 0;
		}
		return 1;
	}
public static void main(String[] args) {
	int arr[]= {1,3,4};
	System.out.println(Permutation.checkPermute(arr));
}
}
