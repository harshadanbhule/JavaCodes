/*3.Write a program to print the given pattern
rows=3
C
C B
C B A

rows=4
D
D C
D C B
D C B A*/

import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();

                for(int i=1;i<=row;i++){
			int num=row;
                        for(int j=1;j<=i;j++){
                                System.out.print((char)(num+64)+" ");
				num--;
                        }
                        System.out.println(" ");
                }
        }
}
