/*9. Write a program to print the given pattern
rows =3

4
4 a
4 b 6

rows =4
5
5 a
5 b 7
5 c 7 d*/

import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                int num=1;
                for(int i=1;i<=row;i++){
			int temp=row+1;
                        for(int j=1;j<=i;j++){
                                if(j%2!=0){
                                        System.out.print(temp+" ");
                                }else{
                                        System.out.print((char)(num+96)+" ");
                                        num++;
                                }
				temp++;

                        }
                        System.out.println(" ");
                }
        }
}
