/*
 Q2
Write a program to find the first occurrences of a specific number in an array. Print the
index of a first occurrence.
Example :
1 5 9 8 7 6
Input: Specific number : 5
Output: num 5 first occurred at index : 1
Input: Specific number : 11
Output: num 11 not found in array.*/

import java.util.*;

class Demo{                                                                                                                                                         public static void main(String[] args){                                                                                                                                                                                                                                                                                         Scanner sc=new Scanner(System.in);                                                                                                                          System.out.println("Enter Size : ");
                int size=sc.nextInt();
                int[] arr=new int[size];
                System.out.println("Enter elements: ");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }

                 System.out.println("Output: ");
		int num=sc.nextInt();
		boolean ans=false;
                for(int j=0;j<size;j++){
                  if(num==arr[j]){
			ans=true;  
		  	System.out.println("num "+ num +" first occurred at index : "+j);
		  }
                }

		if(!ans){
			 System.out.println("num "+num+" not found in array.");
		}
                                                                                                                                                                    }
}
