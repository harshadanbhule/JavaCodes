/*10. Write a program to print the given pattern
rows=3
1
b c
4 5 6

rows=4
1
b c
4 5 6
g h i j*/

import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                int num=1;
                for(int i=1;i<=row;i++){

                        for(int j=1;j<=i;j++){
                                if(i%2!=0){
                                        System.out.print(num+" ");
                                }else{
                                        System.out.print((char)(num+96)+" ");
                                        
                                }
				num++;
                        }
                        System.out.println(" ");
                }
        }
}
