//Maximum Product Subarray in an Array  brutforce approach


class Demo{
	static int result(int arr[]){
		int maxProd=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int prod=1;
				for(int k=i;k<=j;k++){
					prod*=arr[k];
				}
				if(prod>maxProd){
					maxProd=prod;
				}
			}
		}
		return maxProd;
	}
	public static void main(String[] args){
		int nums[] = {1,2,-3,0,-4,-5};
		int answer = result(nums);
		System.out.print("The maximum product subarray is: "+answer);
	}
}
