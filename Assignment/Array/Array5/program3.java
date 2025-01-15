/*
 Q3. WAP to check if an array is a palindrome or not .
Example :
Input:
Enter the size of the array:
6
Enter the elements of the array:
1
2
3
3
2
1
Output:
The given array is a palindrome array.*/

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
                boolean check=true;
                for(int j=0;j<size/2;j++){
                        if(arr[j]!=arr[size-j-1]){
				check=false;
				break;
			}
                }
                if (check){
            		System.out.println("The given array is a palindrome array.");
        	} else {
            		System.out.println("The given array is not a palindrome array.");
        	}
        }
}
