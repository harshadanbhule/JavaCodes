/*
 Q1.WAP to take input from the user for size and elements of an array, where you have to
print the average of array elements(Array should be of integers).
Example :
Input:
Enter the size:
4
Enter array elements:
2
4
6
8
Output:
Array elements' average is :5*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size=sc.nextInt();

		int [] arr=new int[size];
		System.out.println("Enter Elements : ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<size;j++){
			sum+=arr[j];	
		}

		double average=(double)sum/size;

		System.out.println("Array elements' average is : "+ average);
	}
}
