
/*
 Q6. WAP to count the vowels and consonants in the given array(Take input from the user)
Example:
Enter the size of the array:
6
Enter the elements of the array:
a
E
P
o
U
G
Output:
Count of vowels: 4

Count of consonants: 2*/

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
                
               	int vowels=0;
                int consonants=0;
                for(int j=0;j<size;j++){
		char c=arr[j];
                     if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                      	vowels++;
                     }else{
		     	consonants++;
		     }
                }

                System.out.println("Count of vowels: "+vowels);
		System.out.println("Count of consonants: "+consonants);
        }
}
