/*
 9. Write a program where you have to print the odd indexed elements. Take input from
the user
Example :
Enter size: 10.
1 2 3 4 5 6 7 8 9 10
2 is an odd indexed element
4 is an odd indexed element
6 is an odd indexed element
8 is an odd indexed element
10 is an odd indexed element*/


import java.util.*;
class Demo{
        public static void main(String [] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Array size : ");
                int size=sc.nextInt();                                                                                                                                                                                                                                                                                                  int[] number= new int [size];                                                                                                                                                                                                                                                                                           System.out.println("Enter Array numbers : ");
                for(int i=0;i<number.length;i++){                                                                                                                                   number[i]=sc.nextInt();
                }                                                                                                                                                           System.out.println("Output : ");

                for(int j=0;j<number.length;j++){
                        if(j%2!=0){
                         System.out.println(number[j]+" is an odd indexed element");                                                                                                                                          }

                }                                                                                                                                                   }                                                                                                                                                   }
