/*
 Q6
Write a program to print all the consonants in an array.
a b c y x o p
Output:
b c y x p*/

import java.util.*;

class Demo{                                                                                                                                                         public static void main(String[] args){                                                                                                                                                                                                                                                                                         Scanner sc=new Scanner(System.in);                                                                                                                          System.out.println("Enter Size : ");
                int size=sc.nextInt();
                char[] arr=new char[size];
                System.out.println("Enter elements: ");
                for(int i=0;i<size;i++){
                      arr[i]=sc.next().charAt(0);
                }

                 System.out.println("Output: ");
                for(int j=0;j<size;j++){
                  char ch = arr[j];
            		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
                        
                        System.out.println( ch );
                  }
                }

        }
}
