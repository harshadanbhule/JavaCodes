//sum of digits in string


import java.util.*;

class Demo{

	int answer(String input){
		char arr[]=input.toCharArray();
		int sum=0;
		for(int i=0;i<arr.length;i++){
			char n=arr[i];
			if('1'<=n && n<='9'){
				sum+=n-'0';
			}
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String input=sc.nextLine();

		Demo obj=new Demo();
		int result=obj.answer(input);
		System.out.println(result);

	}
}

/*
input :sjjs87wskw55
o/p: 25
explain : sum of all numbers in string is 25*/
