//Rearrange array in increasing-decreasing order
/*
Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

Example 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8*/

import java.util.*;
class Demo{
        public static void main(String [] args){
                int arr[]=new int[]{8,7,1,6,5,9};
                int mid=arr.length/2;
		Arrays.sort(arr);
		int num=1;
                for(int i=0;i<arr.length;i++){
                        if(i<mid){
				System.out.print(arr[i]+" ");

			}else{
				System.out.print(arr[arr.length-num]+" ");
				num++;
			}
                }
          }
}
