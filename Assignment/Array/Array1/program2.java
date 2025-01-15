/*
2. Take an input from the user where the size of the array should be 10 and print the
output of the user given elements of an array. 
*/

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

                for(int i=0;i<number.length;i++){
                        System.out.println(number[i]);
                }
        }
}
