//find factor count(optimized code)

import java.util.*;

class Demo{
	static int facto(int num){
		int count=0;

		for(int i=1;i*i<=num;i++){
			if(num%i==0){
				if(num/i==i){
					count=count+1;
				}else{
					count=count+2;
				}
			}

		}
		return count;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=facto(num);
		System.out.println("Count of factors :"+count);

	}
}
