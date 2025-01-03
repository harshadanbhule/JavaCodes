//Maximum sum of subarray  brutforce


import java.util.*;

class Demo{

	public static void main(String[] args){
		int arr[] =new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int maxval=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=i;j<arr.length;j++){
			
				sum+=arr[j];		
				
				if(maxval< sum){
					maxval=sum;
				}
				
			}
		}
		System.out.println(maxval);
	}
}


//output=6
