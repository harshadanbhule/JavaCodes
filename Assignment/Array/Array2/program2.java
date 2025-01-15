/*
 2.WAP to print the sum of elements divisible by 3 in the array, where you have to take the
size and elements from the user.
Example:
Enter size : 8
9 13 5 13 6 22 36 10
output:
Elements divisible by 3 : 9 6 36
Sum of elements divisible by 3 is: 51*/


import java.util.*;

class Demo{
        public static void main(String[] args){
                int counter=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Size : ");
                int size=sc.nextInt();

                int[] arr=new int[size];
                System.out.println("Enter Numbers : ");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Elements divisible by 3 : ");
                for(int j=0;j<size;j++){

                        if(arr[j]%3==0){

                                counter+=arr[j];
                                System.out.print(arr[j]+",");
                        }
                }
                System.out.println("");
                System.out.println("Sum of elements divisible by 3 is: "+counter);
        }
}
