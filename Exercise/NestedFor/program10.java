/*Write a program to print the following pattern
Number of rows = 4
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7

Number of rows = 3
1 2 3
2 3 4
3 4 5*/

import java.util.*;

class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                
                for(int i=1;i<=row;i++){
			int num=i;
                        for(int j=1;j<=row;j++){
                                System.out.print(num+" ");
				num++;
                        }
                        System.out.println(" ");
                }

        }
}
