/*WAP in notebook & Dry run first then type
Take number of rows from user :
Row = 3
1
2 4
3 6 9

Rows = 4
1
2 4
3 6 9
4 8 12 16*/

import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
		int num=1;
                for(int i=1;i<=row;i++){
                       
                        for(int j=1;j<=i;j++){
                                System.out.print(j*num+" ");
				
                        }
			num++;
                        System.out.println(" ");
                }
        }
}
