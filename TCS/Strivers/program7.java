//Calculate Sum of the Elements of the Array

import java.util.*;
class Demo{
        public static void main(String [] args){
                int arr[]=new int[]{8,7,1,6,5,9};
                
                int sum=0;
                for(int i=0;i<arr.length;i++){
                     sum+=arr[i];
                }
		System.out.print(sum);
          }
}
