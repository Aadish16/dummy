package com.lti.codility;

public class codility1 {
	class Solution {
		 int solution(int N) {
		        
		        if (N==0 || (N & (N-1))==0)
		        return -1;

		        byte b= 4;
		        int setBit=1, prev=0,i;
		        for(i=1; i<=b*8; i++){
		            prev++;

		            if((N & setBit)==setBit){
		                setBit=setBit<<1;
		                break;
		            }
		            setBit=setBit<<1;
		        }
		        int max0=Integer.MIN_VALUE, cur= prev;
		        for(int j=i+1;j<=b*8; j++){
		            cur++;
		            if((N & setBit)==setBit){
		                if(max0<(cur-prev-1)){
		                    max0=cur-prev-1;
		                }
		                prev=cur;
		            }
		            setBit=setBit<<1;
		        }
		        return max0;
		    }
		   public void main(String[] args){
		        int N= 31;
		        System.out.println(solution(N));
		    }
		}

}
