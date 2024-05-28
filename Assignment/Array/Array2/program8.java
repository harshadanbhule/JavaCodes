/*
 8.WAP to print the elements in an array which are greater than 5 but less than 9, where
you have to take the size and elements from the user.
Example:
Input:
Enter the size
5
Enter elements:
4
8
6
9
41
Output:
8 is greater than 5 but less than 9
6 is greater than 5 but less than 9*/

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
                for(int j=0;j<size;j++){

                        if(arr[j]<9 && arr[j]>5){
                                System.out.println(arr[j]+ " is greater than 5 but less than 9");
                        }
                }
        }
}
