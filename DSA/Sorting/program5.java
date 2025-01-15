//selection sort using recursion


class Demo{
	
        void fun(int arr[],int start,int end){
        		int maxindex=start;
		 	if(start>end){
				return;
			}	
                        for(int j=start+1;j<arr.length;j++){
                                if(arr[j]<arr[maxindex]){
                                        maxindex=j;
                                }
                        }
                        int temp=arr[start];
                        arr[start]=arr[maxindex];
                        arr[maxindex]=temp;

			fun(arr,start+1,end);
                }
        public static void main(String[] args){
                int arr[]=new int[]{2,1,4,3,6,5};
                int end=arr.length-2;
		int start=0;
                Demo obj=new Demo();
                obj.fun(arr,start,end);
	
                for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]);
                }
        }
}

/*
1
2
3
4
5
6*/
