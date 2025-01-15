/*
 Q5. WAP to print the count of digits in elements of an array.
Example :
Input:
Enter the size of the array:
4
Enter the elements of the array:
1
225
32
356

Output:
1, 3, 2, 3*/

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
                System.out.println("Output : ");
                for(int j=0;j<size;j++){
		int num=arr[j];
		int count=0;
                     while(num!=0){
		     	num/=10;
			count++;
		     }
		     System.out.println(count);
                }
        }
}
