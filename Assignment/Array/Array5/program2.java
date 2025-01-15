/*
 Q2. WAP to print the sum of odd and even numbers in an array.
Enter the size of the array:
6
Enter the elements of the array:
10
15
9
1
12
15
Output:
Odd Sum = 40
Even Sum = 22*/

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
                int odd=0;
		int even=0;
                for(int j=0;j<size;j++){
                        if(arr[j]%2!=0){
				odd+=arr[j];
			}else{
				even+=arr[j];
			}
                }
                System.out.println("odd sum = "+odd);
                System.out.println("even sum = "+even);
        }
}
