/*
 Q4. WAP to check the first duplicate element in an array and return its index.
Example :
Input:
Enter the size of the array:
6
Enter the elements of the array:
1
2
3
3
2
5
Output:
First duplicate element present at index 1*/

import java.util.*;
                                                                                                                                                            class Demo{
        public static void main(String[] args){                                                                                                                             Scanner sc=new Scanner(System.in);
                System.out.println("Enter Size : ");
                int size=sc.nextInt();
                int [] arr=new int[size];
                System.out.println("Enter Elements : ");
                for(int i=0;i<size;i++){                                                                                                                                            arr[i]=sc.nextInt();
                }
		boolean check=false;
		for (int i = 0; i < size - 1; i++) {
            		for (int j = i + 1; j < size; j++) {
                		if (arr[i] == arr[j]) {
                    			System.out.println("First duplicate element present at index " + i);
					check=true; 
                    			break;
               			 }
           		 }
			if(check){
				break;
			}
       		 }
		
	if(!check){
        System.out.println("No duplicate elements found.");
        }
	}
}
