/*
4.WAP to search a specific element in an array and return its index. Ask the user to
provide the number to search, also take size and elements input from the user.
Example:
Input:
Enter the size
5
Enter elements:
12
144
13
156
8
Enter the number to search in array:
8

Output:
8 found at index 4 */


import java.util.*;

class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Size : ");
                int size=sc.nextInt();

                int[] arr=new int[size];
                System.out.println("Enter elements: ");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter the number to search in array:");
		int num = sc.nextInt();
                for(int j=0;j<size;j++){
                     
                        if(arr[j]==num){

                                System.out.println(num + " found at index "+j);
                        }
                }
        }
}
