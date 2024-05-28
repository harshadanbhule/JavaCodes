/*
 Q4
Write a program to convert all even numbers into 0 and odd numbers into 1 in a given
array.
1 2 3 12 15 6 7 10 9
Output:

1 0 1 0 1 0 1 0 1*/

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
                  if(arr[j]%2==0){
                        System.out.println("0");
                  }else{
		  	System.out.println("1");
		  }
                }

        }
}
