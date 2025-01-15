/*
Write a program to print the following pattern
Number of rows = 3
1A 1A 1A
1A 1A 1A
1A 1A 1A
Number of rows = 4
1A 1A 1A 1A
1A 1A 1A 1A
1A 1A 1A 1A
1A 1A 1A 1A*/

import java.util.*;

class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();

                for(int i=1;i<=row;i++){
                        for(int j=1;j<=row;j++){
                                System.out.print("1A ");
                                
                        }
                        System.out.println(" ");
                }

        }
}
