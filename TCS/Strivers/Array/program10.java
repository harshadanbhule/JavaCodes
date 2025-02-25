/*Find Median of the given Array
Problem Statement: Given an unsorted array, find the median of the given array.

Examples:

Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5*/

import java.util.*;
class Demo{
        public static void main(String [] args){
                int arr[]=new int[]{2,5,1,7};
		int num=arr.length/2;
		double med=0;
                Arrays.sort(arr);
		if(arr.length%2==0){
			med=(arr[num]+arr[num-1])/2.0;
		}else{
			med=arr[num];
		}
		
                System.out.println(med);
        }
}
