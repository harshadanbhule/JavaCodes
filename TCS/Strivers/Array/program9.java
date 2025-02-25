/*Average of all the elements in the array


35

0
Problem Statement: Given an array, we have to find the average of all the elements in the array.

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 3
Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+3+4+5)/5 = 3.

Example 2:
Input:  N=6, array[] = {1,2,1,1,5,1}
Output: 1.8
Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+1+1+5+1)/6 = 1.8*/

import java.util.*;
class Demo{
        public static void main(String [] args){
                int arr[]=new int[]{2,45,1,9,3};

                double sum=0;

		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
	

                System.out.println(sum/(arr.length-1));
        }
}

//15.0
