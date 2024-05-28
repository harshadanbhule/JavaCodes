/*
 6.Write a program to print the products of odd indexed elements in an array. Where you
have to take size input and elements input from the user.
Note:
Example:
Input:
Enter the size
6
Enter elements:
1
2
3
4
5
6
Output:
product of odd indexed elements : 48*/

import java.util.*;

class Demo{
        public static void main(String[] args){
                int counter=1;
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
                                counter*=arr[j];
                        }
                }
                System.out.println("Product of odd indexed elements : "+counter);
        }
}
