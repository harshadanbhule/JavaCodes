
/*Write a program to print the given pattern
rows=3
1
2 a
3 b 3

rows=4
1
2 a*/


import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                for(int i=1;i<=row;i++){
                     
                        for(int j=1;j<=i;j++){
                                if(j%2!=0){
                                        System.out.print(i+" ");
                                }else{
                                        System.out.print((char)(i+95)+" ");
                                }
                              
                        }
                        System.out.println(" ");
                }
        }
}
