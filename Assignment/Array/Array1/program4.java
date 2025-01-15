/*
 4. Write a program to print the sum of odd elements in an array.Take input from the user.
Example:
Enter size: 10
Array:
1 2 3 4 2 5 6 2 8 10
Output :
Sum of odd elements : 9*/

import java.util.*;
class Demo{
        public static void main(String [] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Array size : ");
                int size=sc.nextInt();

                int[] number= new int [size];

                System.out.println("Enter Array numbers : ");
                for(int i=0;i<number.length;i++){
                        number[i]=sc.nextInt();
                }
                System.out.println("Output : ");
		int sum=0;
                for(int j=0;j<number.length;j++){
                        if(number[j]%2!=0){
                        	sum+=number[j];
                        }
                }
		System.out.println(sum);
        }
}
