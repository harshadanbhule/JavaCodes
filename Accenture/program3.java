/*Happy Number */

import java.util.*;

class Demo{

	static HashSet<Integer> newnum= new HashSet<>();

	public static boolean isHappy(int n){
	
		if(n==1){
			return true;
		}

		if(newnum.contains(n)){
			return false;
		}

		newnum.add(n);
		int sum=0;

		while(n>0){
		int digit =n%10;
		sum+=(digit*digit);
		n/=10;
		}

		return isHappy(sum);
	}


	public static void main(String[] args){
	
		int number=19;

		if(isHappy(number)){
			System.out.println("is Happy Number");
		}else{
			System.out.println("is Not Happy Number");
		}
	}
}
