/*
 Q3. WAP to find the second largest element in an array.
Example:
Input:
Enter the size :4
Enter the elements of the array:
1
2
3
4
Output:
The second largest element in the array is: 3*/

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
                int firstLargest=arr[0];
                int secondLargest=arr[0];

                for(int j=0;j<size;j++){
                        if (arr[j] > firstLargest) {
                		secondLargest = firstLargest;
                		firstLargest = arr[j];
			}
                }


                System.out.println("The second largest element in the array is: "+ secondLargest);
        }
}
