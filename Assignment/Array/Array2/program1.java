/*
 1.WAP to count the even numbers in an array where you have to take the size and
elements from the user. And also print the even numbers too
Example:
Enter size =8
1 12 55 65 44 22 36 10
Output : even numbers 12 44 22 36 10
Count of even elements is : 5*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		int counter=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size=sc.nextInt();

		int[] arr=new int[size];
		System.out.println("Enter Numbers : ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("even numbers : ");
		for(int j=0;j<size;j++){
			
			if(arr[j]%2==0){

				counter++;
				System.out.print(arr[j]+",");
			}
		}
		System.out.println("");
		System.out.println("Count of even elements is : "+counter);
	}
}
