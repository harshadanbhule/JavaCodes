//Rotate array by K elements - Block Swap Algorithm
/*
Example 1:
Input: N = 5, array[] = {1,2,3,4,5} K=2
Output: {3,4,5,1,2}
Explanation: Rotate the array to right by 2 elements.

Example 2:
Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
Output: {4,5,6,7,1,2,3}
Explanation: Rotate the array to right by 3 elements.*/

import java.util.*;
class Demo{

	void answer(int arr[],int rotate){
		int temparr[]=new int[rotate];

		for(int i=0;i<rotate;i++){
			temparr[i]=arr[i];
		}

		for(int i=rotate;i<arr.length;i++){
			arr[i-rotate]=arr[i];
		}
		int j=0;
		for(int i=arr.length-temparr.length;i<arr.length;i++){
			arr[i]=temparr[j];
			j++;
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter rotate element : ");
		int rotate=sc.nextInt();
		Demo obj=new Demo();
		obj.answer(arr,rotate);
	}
}

/*
Enter size of array :
6
1
2
3
4
5
6
Enter rotate element :
2
3 4 5 6 1 2*/
