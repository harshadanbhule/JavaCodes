/*5. Write a program to print the given pattern
rows =3

D
E F
G H I

rows = 4
E
F G
H I J
K L M N*/

import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
		int num=row;
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=i;j++){
                                System.out.print((char)(num+65)+" ");
                                num++;
                        }
                        System.out.println(" ");
                }
        }
}
