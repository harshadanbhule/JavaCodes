//prime number sum

import java.util.*;

class Demo{

	public static boolean isPrime(int n){
	
		if(n<2){
			return false;
		}
		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		if(n<2){
			System.out.println(0);
			return;
		}
		int sum=0;
		for(int i=2;i<=n;i++){
		if(isPrime(i)){
			sum+=i;
			}
		}
		System.out.println(sum);
	}

}
