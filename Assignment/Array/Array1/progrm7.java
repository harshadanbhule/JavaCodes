/*
 7. Write a program to print the elements of the array which is divisible by 4. Take input
from the user.
Example:
Enter size: 10
14 20 18 9 11 51 16 2 8 10*/

import java.util.*;
class Demo{
        public static void main(String [] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Array size : ");
                int size=sc.nextInt();                                                                                                                                                                                                                                                                                                  int[] number= new int [size];                                                                                                                                                                                                                                                                                           System.out.println("Enter Array numbers : ");
                for(int i=0;i<number.length;i++){                                                                                                                                   number[i]=sc.nextInt();
                }                                                                                                                                                           System.out.println("Output : ");

                for(int j=0;j<number.length;j++){
                        if(number[j]%4==0){
                         System.out.println(number[j]+" is Divisible by 4");                                                                                                                                          }

                }                                                                                                                                                   }                                                                                                                                                   }
