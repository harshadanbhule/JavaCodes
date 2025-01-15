/*
 Q5. WAP to reverse the array(take input from the user).
Example:
Input:
Enter the size of the array:
6
Enter the elements of the array:
1
2
3
4
5
6
Output:
Reversed array:
6
5
4
3
2
1*/


import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Size : ");
                int size=sc.nextInt();

                int [] arr=new int[size];
                System.out.println("Enter Elements : ");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Reversed array : ");
              
                int num=0;
                for(int j=size-1;j>=0;j--){
                	System.out.println(arr[j]);     
                }

                
        }
}
