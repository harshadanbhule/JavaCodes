/*Write a program to print the following pattern
Number of rows = 4
1 2 3 4
4 5 6 7
7 8 9 10
10 11 12 13
Number of rows = 3
1 2 3
3 4 5
5 6 7*/

import java.util.*;

class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                int num=2;
                for(int i=1;i<=row;i++){
			num-=1;
                        for(int j=1;j<=row;j++){
                                System.out.print(num+" ");
                                num++;
                        }
                        System.out.println(" ");
                }

        }
}
