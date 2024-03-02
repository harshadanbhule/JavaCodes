/*8. WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 4
1 2 3 4
2 3 4
3 4
4
Rows = 3
1 2 3
2 3
3*/

import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
		int num1=0;
                for(int i=row;i>=1;i--){
		 	int num2=1;	
                        for(int j=i;j>=1;j--){
				
                                System.out.print(num2+num1+" ");
                                num2++;

                        }
			num1++;
			
                        System.out.println(" ");
                }
        }
}
