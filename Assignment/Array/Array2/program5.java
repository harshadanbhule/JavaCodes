/*
 5.Write a program to print the sum of odd indexed elements, in an array. Where you have
to take size input and elements input from the user .
Example:
Input:
Enter the size
5
Enter elements:
4
8
2
6
7
Output:
Sum of odd indexed elements : 14*/

import java.util.*;

class Demo{
        public static void main(String[] args){
		int counter=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Size : ");
                int size=sc.nextInt();

                int[] arr=new int[size];
                System.out.println("Enter elements: ");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                
                for(int j=0;j<size;j++){

                        if(arr[j]%2!=0){
				counter+=arr[j];
                        }
                }
		System.out.println("Sum of odd indexed elements : "+counter);
        }
}
