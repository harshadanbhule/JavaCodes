/*2. WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 3
3
3 2
3 2 1

Rows = 4
4
4 3
4 3 2
4 3 2 1*/


import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
		
                for(int i=1;i<=row;i++){
			int num=row;
                        for(int j=0;j<i;j++){
                                System.out.print(j+num+" ");
				num-=2;
                        }
                        System.out.println(" ");
                }
        }
}
