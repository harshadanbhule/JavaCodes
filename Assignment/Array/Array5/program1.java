/*
 Q1. WAP to check whether the array is in ascending order or not.
Input 1:
Enter the size of the array:
4
Enter the elements of the array:
1
5
9
15
Output 1:
The given array is in ascending Order.
Input 2 :
Enter the size of the array:
4
Enter the elements of the array:
1
5
9
7
Output 2 :
The given array is not in ascending Order.*/

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
		boolean ascending=true;
                for(int j=1;j<size;j++){
                        if(arr[j]<arr[j-1]){
				ascending=false;
				break;
			}
                }

		if(!ascending){
			System.out.println("The given array is not in ascending Order");
		}else{
			System.out.println("The given array is in ascending Order");
		}
              
        }
}
