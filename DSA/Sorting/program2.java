//Bubble sort using recursion

class Demo{
	static int count=0;
	void fun(int arr[],int end){
		if(end==1){
			return;
		}
		boolean swap=false;
		for(int i=0;i<end-1;i++){
			count++;
			if(arr[i]>arr[i+1]){
				swap=true;
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;

			}	
		}
		if(swap==false){
                        return;
                }	
		fun(arr,end-1);
	}
	
        public static void main(String[] args){
                //case 1
                //int arr[]=new int[]{5,2,8,3,7,5,6};
                //case 2
                int arr[]=new int[]{1,2,3,5,4,6};
		int end=arr.length;
		Demo obj=new Demo();
		obj.fun(arr,end);
               
                for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }

		System.out.println("Count : "+ count);
                
        }
}

/*
 1 2 3 4 5 6 Count : 9*/
