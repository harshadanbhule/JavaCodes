/*
 5. Write a program where you have to print the elements from the array which are less
than 10.Take input from the user.
Example:
Enter size: 10

11 2 18 9 10 5 16 20 8 10
Output :
2 is less than 10
9 is less than 10
5 is less than 10
8 is less than 10*/


import java.util.*;
class Demo{
        public static void main(String [] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Array size : ");
                int size=sc.nextInt();                                                                                                                                                                                                                                                                                                  int[] number= new int [size];                                                                                                                                                                                                                                                                                           System.out.println("Enter Array numbers : ");
                for(int i=0;i<number.length;i++){                                                                                                                                   number[i]=sc.nextInt();
                }                                                                                                                                                           System.out.println("Output : ");
                
                for(int j=0;j<number.length;j++){
                        if(number[j]<10){
                         System.out.println(number[j]+" is less than 10");                                                                                                                                          }
                  
		}                                                                                                                                                   }                                                                                                                                                   }
