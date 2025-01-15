/*
 Q1
Write a program to add 15 in all elements of the array and print it.
10 20 30 40 50 60
Output:
25 35 45 55 65 75*/

import java.util.*;

class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Size : ");
                int size=sc.nextInt();

                int[] arr=new int[size];
                System.out.println("Enter elements: ");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }

		for(int i=0;i<size;i++){
                        arr[i]+=15;
                }
		 System.out.println("Output: ");
                
                for(int j=0;j<size;j++){

                  System.out.println(arr[j]);
                }
                
        }
}
