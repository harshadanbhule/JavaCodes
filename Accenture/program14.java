/*
 Breaking an Integer to get Maximum Product
Last Updated : 10 Apr, 2024
Generative Summary
Now you can generate the summary of any article of your choice.
Got it
Given a number n, the task is to break n in such a way that multiplication of its parts is maximized. 

Input : n = 10
Output: 36
Explanation: 10 = 4 + 3 + 3 and 4 * 3 * 3 = 36 is the maximum possible product.

Input: n = 8
Output: 18
Explanation: 8 = 2 + 3 + 3 and 2 * 3 * 3 = 18 is the maximum possible product.*/


class Demo{
	public static int answer(int n){
	
		if(n==2){
			return 1;
		}
		if(n==3){
			return 2;
		}
		int prod=1;
		while(n>4){
			prod*=3;
			n-=3;
		}
		prod*=n;
		return prod;
	}
	public static void main(String[] args){
		int n=8;

		int result=answer(n);
		System.out.println(result);
	}
}
