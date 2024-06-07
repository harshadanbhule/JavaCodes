/*
 Q2.WAP to find the difference between minimum element in an array and maximum
element in an array, take input from the user.
Example :
Input:
Enter the size :
5
Enter the elements of the array:
3
6
9
8
10
Output
The difference between the minimum and maximum elements is: 7*/

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
                int min=arr[0];
		int max=arr[0];

                for(int j=0;j<size;j++){
                        if(min>arr[j]){
				min=arr[j];
			}
			if(max<arr[j]){
				max=arr[j];
			}
                }

                int diff=max-min;

                System.out.println("The difference between the minimum and maximum elements is: "+ diff);
        }
}
