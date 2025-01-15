//maximum subarray sum using kadance algorithm (optimized code) 



class Demo{
	public static void main(String[] args){
		
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int maxsum=Integer.MIN_VALUE;
		int sum=0;

		for(int i=0;i<arr.length;i++){
			sum+=arr[i];

			if(sum>maxsum)
				maxsum=sum;

			if(sum<0){
				sum=0;
			}
		}

		System.out.println(maxsum);
	}
}


//o/p=6
