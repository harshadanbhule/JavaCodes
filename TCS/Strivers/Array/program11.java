//Remove Duplicates in-place from Sorted Array

import java.util.*;
class Demo{

	static int answer(int arr[]){
	
		int i=0;
		for(int j=1;j<arr.length;j++){
			if(arr[i]!=arr[j]){
				arr[i+1]=arr[j];
				i++;
			}
		}
		return i+1;
	}
        public static void main(String [] args){
                int arr[]=new int[]{1,1,2,2,3,4,4,5};
               	int x=answer(arr);

		for(int i=0;i<x;i++){
                	System.out.println(arr[i]);
		}
        }
}
