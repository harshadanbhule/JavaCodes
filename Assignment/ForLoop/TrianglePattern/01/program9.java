/*9. WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 4
D C B A
D C B
D C
D

Rows = 5
E D C B A
E D C B
E D C
E D
E*/


import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();

                for(int i=row;i>=1;i--){
                        int num=row;
                        for(int j=i;j>=1;j--){

                                System.out.print((char)(num+64)+" ");
				num--;
                        }

                        System.out.println(" ");
                }
        }
}
