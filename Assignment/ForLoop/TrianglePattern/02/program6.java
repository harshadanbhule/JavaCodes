/*6. Write a program to print the given pattern
rows=3
1
B C
1 2 3

rows=4
1
B C
1 2 3
G H I J*/

import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                char ch=65;
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=i;j++){
                                if(i%2!=0){
					System.out.print(j+" ");
				}else{
					System.out.print(ch+" ");
				}
                                ch++;
                        }
                        System.out.println(" ");
                }
        }
}
