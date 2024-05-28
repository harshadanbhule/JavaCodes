/*
 Q5
Write a program to convert all negative numbers into their squares in a given array.

-2 5 -6 7 -3 8

Output:
4 5 36 7 9 8*/

import java.util.*;

class Demo{                                                                                                                                                         public static void main(String[] args){                                                                                                                                                                                                                                                                                         Scanner sc=new Scanner(System.in);                                                                                                                          System.out.println("Enter Size : ");
                int size=sc.nextInt();
                int[] arr=new int[size];
                System.out.println("Enter elements: ");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }

                 System.out.println("Output: ");
               
                for(int j=0;j<size;j++){
                 	arr[j]*=arr[j];
                        System.out.println(arr[j]);
                  
              }

        }
}
