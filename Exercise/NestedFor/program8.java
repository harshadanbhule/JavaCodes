/*Write a program to print the following pattern
Number of rows = 3
C1 C2 C3
C4 C5 C6
C7 C8 C9
Number of rows = 4
D1 D2 D3 D4
D5 D6 D7 D8
D9 D10 D11 D12
D13 D14 D15 D16*/

import java.util.*;

class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
		int num=1;
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=row;j++){
                                System.out.print((char)(row+64)+""+num+" ");
                                num++;
                        }
                        System.out.println(" ");
                }

        }
}
