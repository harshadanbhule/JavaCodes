/*
 3. Write a program to print the even elements in the array. Take input from the user.
Example :
Enter size : 10
Array:
10 11 12 13 14 15 16 17 18 19
Output :
10
12
14
16
18*/


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
		for(int j=0;j<number.length;j++){
                	if(number[j]%2==0){
                	System.out.println(number[j]);
                        }
        	}
	}	
}
