//Maximum sum of subarray  prefix sum


import java.util.*;

class Demo{

        public static void main(String[] args){
                int arr[] =new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int size=arr.length;
		int prefsum[]=new int[size];
		prefsum[0]=arr[0];

		for(int i=1;i<size;i++){
			prefsum[i]=prefsum[i-1]+arr[i];
		}

                int maxval=Integer.MIN_VALUE;
                for(int i=0;i<arr.length;i++){
                        int sum=0;
                        for(int j=i;j<arr.length;j++){
				if(i==0)
					sum=prefsum[j];
				else
                                	sum=prefsum[j]-prefsum[i-1];

                                if(maxval< sum){
                                        maxval=sum;
                                }

                        }
                }
                System.out.println(maxval);
        }
}


//output=6
