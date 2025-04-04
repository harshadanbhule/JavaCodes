//lcm

import java.util.*;
class Demo{
	static int gcd(int n1,int n2){
		while(n2!=0){
			int temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		return n1;
	}
	static int answer(int n1,int n2){

		return (n1*n2)/gcd(n1,n2);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();

		int result=answer(n1,n2);
		System.out.println(result);
	}
}
