//Maximum Product Subarray in an Array  brutforce approach 2 n^2


class Demo{
        static int result(int arr[]){
                int maxProd=Integer.MIN_VALUE;

                for(int i=0;i<arr.length;i++){
			int prod=1;
                        for(int j=i;j<arr.length;j++){
                                prod*=arr[j];

				maxProd=Math.max(maxProd,prod);
                        }
                }
                return maxProd;
        }
        public static void main(String[] args){
                int nums[] = {1,2,-3,0,-4,-5};
                int answer = result(nums);
                System.out.println("The maximum product subarray is: "+answer);
        }
}
