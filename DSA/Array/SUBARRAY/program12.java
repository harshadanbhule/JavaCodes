//given an array of size N
//find the maximum subarray sum of length k

import java.util.*;

class Demo{

        static int answer(int[] arr,int k){

                int size=arr.length;
                if(k==0){
                        return 0;
                }
		int maxsum=Integer.MIN_VALUE;
                for(int i=0;i<=size-k;i++){
			int sum=0;
			for(int j=i;j<i+k;j++){

				sum+=arr[j];			
			}
			if(sum>maxsum){
                           maxsum=sum;
                        }
                     
                }
                return maxsum;
        }

        public static void main(String[] args){
                Scanner sc =new Scanner (System.in);

                int arr[]=new int[]{-3,4,-2,5,3,-2,8,2,1,4};

                int k=sc.nextInt();
                int ans =answer(arr,k);
                System.out.println(ans);
        }
}

/*input :4
o/p: 15*/
