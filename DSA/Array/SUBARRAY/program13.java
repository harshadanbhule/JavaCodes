//given an array of size N
//find the maximum subarraiy sum of length k(use prefix sum)

import java.util.*;

class Demo{

        static int answer(int[] arr,int k){

                int size=arr.length;
                if(k==0){
                        return 0;
                }
		int prefsum[] =new int[size];
		prefsum[0]=arr[0];

		for(int i=1;i<size;i++){
			prefsum[i]=prefsum[i-1]+arr[i];
		}
                int maxsum=Integer.MIN_VALUE;
                for(int i=0;i<=size-k;i++){
                        int sum=0;
                        if(i==0){
				sum+=prefsum[k-1];
			}else{
				sum=prefsum[k-1+i]-prefsum[i-1];
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
o/p: 15
time complexity =o(N)
space complexity=o(N)*/
