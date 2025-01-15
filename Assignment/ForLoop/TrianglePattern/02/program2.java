/*2.Write a program to print the given pattern
rows=3
a
$ $
a b c

rows=4
a
$ $
a b c
$ $ $ $*/



import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();

                for(int i=1;i<=row;i++){

                        for(int j=1;j<=i;j++){
                                if(i%2!=0){
					System.out.print((char)(96+j)+" ");
				}else{
					System.out.print("$ ");
				}
                        }
                        System.out.println(" ");
                }
        }
}
