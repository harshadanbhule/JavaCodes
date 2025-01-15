/*
 9. WAP to print the minimum element in the array, where you have to take the size and
elements from the user.
Example:
Input:
Enter the size
5
Enter elements:
5
6
9
-9
17
Output:

Minimum number in the array is : -9*/

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
		int min=arr[0];
                for(int j=1;j<size;j++){
			
                        if(arr[j]<min){
                                min=arr[j];
                        }
                }
		System.out.println("Minimum number in the array is : "+min);
        }
}
