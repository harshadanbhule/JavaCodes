/*
 3.WAP to check if there is any vowel in the array of characters if present then print its
index, where you have to take the size and elements from the user.
Example:
Input:
Enter the size
5
Enter elements:
arEKO
Output:
vowel a found at index 0
vowel E found at index 2
vowel O found at index 4*/

import java.util.*;

class Demo{
        public static void main(String[] args){
         
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Size : ");
                int size=sc.nextInt();

                char[] arr=new char[size];
                System.out.println("Enter elements: ");
                for(int i=0;i<size;i++){
                        arr[i]=sc.next().charAt(0);
                }
                System.out.println("Output: ");
                for(int j=0;j<size;j++){
			char ch = arr[j];
                        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

                                System.out.println("vowel " + ch + " found at index " + j);
                        }
                }
        }
}
