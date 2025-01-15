/*
 Q6. WAP to find the first prime number in an array.
Example :
Input:
Enter the size of the array:
6
Enter the elements of the array:
10
22
3
31
50
3
Output:
First prime number found at index 2*/

import java.util.*;
class Demo{
	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array : ");
	int size=sc.nextInt();

	int [] arr=new int[size];
                System.out.println("Enter Elements : ");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
		
                System.out.println("Output : ");
                for(int j=0;j<size;j++){
			 boolean flag=true;
			
			int num=arr[j];
			if(num>1){
				for(int i=2;i<num;i++){
					if(num%i==0){
						flag=false;
						break;
					}
					
				}
				if(flag){
					System.out.println("First prime number found at index "+j);
					return;
				}
				
			}

		}
               
	       }

  
}
