package com.lti.codility.TimeComplexity;

public class FrogJump {
	public static void main(String[] args) {
		System.out.println(new FrogJump().solution(3,999111321,7));
	}
	public int solution(int x, int y, int d) {
		return (int)Math.ceil((double)(y-x)/(double)d);
	}

}
