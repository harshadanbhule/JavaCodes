//Selection sort


class Demo{
	void fun(int arr[],int size){
		for(int i=0;i<size-1;i++){
			int maxindex=i;
			for(int j=i+1;j<size;j++){
				if(arr[j]<arr[maxindex]){
					maxindex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[maxindex];
			arr[maxindex]=temp;
		}
	}
	public static void main(String[] args){
		int arr[]=new int[]{2,1,4,3,6,5};
		int size=arr.length;
		Demo obj=new Demo();
		obj.fun(arr,size);

		for(int i=0;i<size;i++){
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
