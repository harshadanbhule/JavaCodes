/*
 10. WAP to print the Maximum element in the array.
Example:
Input:
Enter the size
5
Enter elements:
7
81
65
12
23
Output:
Maximum number in the array is found at pos 1 is 81*/


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
                int max=arr[0];
		int maxInd=0;
                for(int j=0;j<size;j++){

                        if(arr[j]>max){
                                max=arr[j];
				maxInd=j;
                        }
                }
                System.out.println("Maximum number in the array is found at pos "+ maxInd+" is "+max);
        }
}
