//given an array of size N
//find the given n size  subarray count 
import java.util.*;

class Demo{

	static int answer(int[] arr,int k){
	
		int count =0;
		int size=arr.length;

		for(int i=0;i<size;i++){
			int x=0;
			for(int j=i;j<size;j++){
				x++;
				if(x==k){
				count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args){
		Scanner sc =new Scanner (System.in);

		int arr[]=new int[]{-3,4,-2,5,3,-2,8,2,1,4};
		
		int k=sc.nextInt();
		int ans =answer(arr,k);
		System.out.println(ans);
	}
}

/*
 input is 3 then output is 8*/
