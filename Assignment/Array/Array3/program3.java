/*
 Q3
Write a program to find the number of occurrences of a specific number in an array. Print
the count of occurrences.
2 5 2 7 8 9 2
Input Specific number: 2
Output : Number 2 occurred 3 times in an array.
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
		int counter=0;
                for(int j=0;j<size;j++){
                  if(num==arr[j]){
                        ans=true;
			counter+=1;
                     
                  }
		  
                }
		

                if(!ans){
                         System.out.println("num "+num+" not found in array.");
                }else{
			System.out.println("Number "+num+" occurred "+counter+" times in an array");
		}

        }
}
