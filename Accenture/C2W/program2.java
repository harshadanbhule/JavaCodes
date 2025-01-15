//Reverse array


import java.util.*;

class Demo{
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}

		int temp=0;
		int j=size-1;
		for(int i=0;i<size/2;i++){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;

			j--;
		}

		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
}
