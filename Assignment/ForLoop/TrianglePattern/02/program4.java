/*4.Write a program to print the given pattern
rows=3
c
C B
c b a
rows=4
d
D C
d c b
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
                                if(i%2!=0){
					System.out.print((char)(num+96)+" ");
				}else{
					System.out.print((char)(num+64)+" ");
				}
                                num--;
                        }
                        System.out.println(" ");
                }
        }
}
