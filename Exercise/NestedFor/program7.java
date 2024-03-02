/*Write a program to print the following pattern
Number of rows = 4
d c b a
d c b a
d c b a
d c b a
Number of rows = 3
c b a
c b a
c b a*/

import java.util.*;

class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();

                for(int i=1;i<=row;i++){
                        for(int j=row;j>=1;j--){
                                System.out.print((char)(j+96)+" ");
                        }
                        System.out.println(" ");
                }

        }
}
