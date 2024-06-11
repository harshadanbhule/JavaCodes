/*
 Q8. WAP to print the occurrence of a user given character.
Example:
Input:
Enter the size of the array:
5
Enter the elements of the array:
A
Y
U
O
U
P
Enter the character to check:
U
Output :
U occurs 2 times in the given array.*/


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

                System.out.println("Enter the character to check: ");
		char ch=sc.next().charAt(0);
		int counter=0;
                for(int j=0;j<size;j++){
       
                     if(ch==arr[j]){
                        counter++;
                     }
                }

                System.out.println(ch+" occurs "+counter+" times in the given array.");
        }
}
