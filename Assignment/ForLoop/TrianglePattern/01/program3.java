/*WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 3
A
B C
C D E
Rows = 4
A
B C
C D E
D E F G*/

import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
		char ch='A';
                for(int i=1;i<=row;i++){
                        
                        for(int j=0;j<i;j++){
                                System.out.print(ch+" ");
                                ch++;
                        }
                        System.out.println(" ");
                }
        }
}
