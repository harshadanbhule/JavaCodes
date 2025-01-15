/*
 Q10.Write a program to print the characters in an array which comes before the user
given character.
Output:
Input:
Enter the size:
6
Enter Elements
A
B
Y
G
H
P
Enter character key :
H
Output:
Array:
A
B
Y
G*/

import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Size : ");
                int size=sc.nextInt();

                char [] arr=new char[size];
                System.out.println("Enter Elements : ");
                for(int i=0;i<size;i++){
                        arr[i]=sc.next().charAt(0);
                }
		System.out.println("Enter character key : ");
		char ch=sc.next().charAt(0);
                System.out.println("Output: ");
                 for(int j=0;j<size;j++){
			if(arr[j]==ch){
                       		break;
			}
			System.out.println(arr[j]);
                }
		
        }
}
