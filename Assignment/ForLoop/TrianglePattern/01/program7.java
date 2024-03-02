/*WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 3
1 2 3 4
1 2 3
1 2
1
Rows = 3

1 2 3
1 2
1*/

import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();

                for(int i=row;i>=1;i--){
			int num=1;
                        for(int j=i;j>=1;j--){
                                System.out.print(num+" ");
				num++;

                        }
                        System.out.println(" ");
                }
        }
}
