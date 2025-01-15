//factorial of number using recursion

import java.util.*;

class Demo{

	int factorial(int num){
	
		if(num==0){
			return 1;
		}

		return num*factorial(num-1);
	}

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();

		Demo obj =new Demo();
		int ans=obj.factorial(num);
		System.out.println(ans);
	}
}

/*
 input=5
 o/p=120*/
