/*
 Q4. WAP to check whether the user given number occurs more than 2 times or equals 2
times.
Example :

Input:
Enter the size of the array:
6
Enter the elements of the array:
56
65
78
56
90
56
Enter the number to check:
56
Output:
56 occurs more than 2 times in the array.*/

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
		System.out.println("Enter the number to check: ");
		int num=sc.nextInt();
		int counter=0;
                for(int j=0;j<size;j++){
                     if(num==arr[j]){
		     	counter++;
		     }
                }

                System.out.println(num+" occurs more than "+counter+" times in the array.");
        }
}
