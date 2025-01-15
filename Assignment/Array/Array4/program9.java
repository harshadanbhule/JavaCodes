/*
 Q9. WAP to replace the elements with #, which are not in the range of ‘a to z’.
Input:
Enter the size:
6
Enter Elements
A
B
c
d
E
*
Output
Array:
#

#
c
d
#
#*/

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
                for(int j=0;j<size;j++){
			char c = arr[j];
            		if (!(c >= 'a' && c <= 'z')) {
                		arr[j] = '#';
           		 }
                }
		System.out.println("Output: ");
		 for(int j=0;j<size;j++){
                       System.out.println(arr[j]);
                }
        }
}
