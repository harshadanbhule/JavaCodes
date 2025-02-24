//Reverse a given array

class Demo{
        public static void main(String [] args){
                int arr[]=new int[]{1,2,3,4,5,6};
                int len=arr.length;
		int mid=len/2;
		int temp=0;
		for(int i=0;i<mid;i++){
			temp=arr[i];
			arr[i]=arr[len-i-1];
			arr[len-i-1]=temp;
			
		}
		for(int i=0;i<len;i++){
			System.out.println(arr[i]);
		}
                
        }
}
