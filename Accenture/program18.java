//first double occurance of char

import java.util.*;

class Demo{

	public static int answer(char[] arr,int length){
		int an=0;
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(arr[i]==arr[j]){
					 an=i;
					break;

				}
			}
		
		}
		return an;
	}

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int n=str.length();
		char[] arr=new char[n];
		arr=str.toCharArray();

		int fin=answer(arr,n);
		System.out.println(arr[fin]);
	}
}
