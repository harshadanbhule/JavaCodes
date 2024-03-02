/*Write a program to print the following pattern
Number of rows = 3
A C E
G I K
M O Q*/

import java.util.*;

class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
		char ch='A';

                for(int i=1;i<=row;i++){
                        for(int j=1;j<=row;j++){
                                System.out.print(ch+" ");
				ch++;
                        }
                        System.out.println(" ");
                }

        }
}
