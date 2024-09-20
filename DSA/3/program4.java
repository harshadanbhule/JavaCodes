// find count betn x and y(optimized way)

import java.util.*;
class Demo{
	
	static int fun(int start ,int end){
		return end-start+1;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int ans=fun(start,end);
		System.out.println(ans);
	}
}
