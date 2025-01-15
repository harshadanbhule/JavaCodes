/*Write a program to print the following pattern
Number of rows = 3
1A 2B 3C
1A 2B 3C
1A 2B 3C
Number of rows = 4
1A 2B 3C 4C
1A 2B 3C 4C
1A 2B 3C 4C
1A 2B 3C 4C*/

import java.util.*;

class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();

                for(int i=1;i<=row;i++){
			char ch='A';
                        for(int j=1;j<=row;j++){
                                System.out.print(j+""+ch+" ");
                                ch++;
                        }
                        System.out.println(" ");
                }

        }
}
