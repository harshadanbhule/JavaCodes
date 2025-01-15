//binary serach

import java.util.*;

class Demo{
	
	int fun(int arr[],int num){
		int end=arr.length-1;
		int start=0;
	
		while(start<end){
			int mid=start+end/2;

			if(arr[mid]==num){
				return mid;
			}
			if(arr[mid]<num){
				start=mid+1;
			}
			if(arr[mid]>num){
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		Demo obj=new Demo();

		int arr[]=new int[]{4,8,9,11,13,19};
		System.out.println("Enter number : ");
		int num=sc.nextInt();

		int ans=obj.fun(arr,num);
		if(ans==-1){
			System.out.println("Number not found");
		}else{
			System.out.println(ans);
		}
		

	}
}

/*
Enter number :
9
2
Time complexity : log n*/
