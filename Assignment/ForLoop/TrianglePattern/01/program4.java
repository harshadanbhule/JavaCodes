/*3
3 6
3 6 9
Rows = 4
4
4 8
4 8 12
4 8 12 16*/

import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                
                for(int i=1;i<=row;i++){
			int num=row;
                        for(int j=1;j<=i;j++){
                                System.out.print(num*j+" ");
                                
                        }
                        System.out.println(" ");
                }
        }
}
