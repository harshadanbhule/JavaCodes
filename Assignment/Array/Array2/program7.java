/*
 7.WAP to print the array , if the user given size of an array is even then print the alternate
elements in an array, else print the whole array.
Example 1:
Input:
Enter the size
5
Enter elements:
1
2
3
4

5
Output:
Array elements are:
1
2
3
4
5
Example 2:
Input:
Enter the size
4
Enter elements:
1
2
3
4
Output:
Array elements are:
1
3*/

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
		System.out.println("Array elements are: ");
                for(int j=0;j<size;j++){

                        if(size%2==0){
                                if(j%2==0){
					System.out.println(arr[j]);
				}
                        }else{
				System.out.println(arr[j]);
			}
                }
                
        }
}
