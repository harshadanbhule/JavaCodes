/*6. WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 3
3 3 3
2 2
1
Rows = 4
4 4 4 4
3 3 3
2 2
1*/

import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
               
                for(int i=row;i>=1;i--){

                        for(int j=i;j>=1;j--){
                                System.out.print(i+" ");

                        }
                        System.out.println(" ");
                }
        }
}
