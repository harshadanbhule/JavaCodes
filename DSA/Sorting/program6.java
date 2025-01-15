//merge sort

class Demo{

	void merge(int arr[],int start,int mid,int end){
		int n1=mid-start+1;
		int n2=end-mid;

		int arr1[]=new int[n1];
		int arr2[]=new int[n2];

		for(int i=0;i<n1;i++){
		
			arr1[i]=arr[start+i];
		}

		for(int i=0;i<n2;i++){

                        arr2[i]=arr[mid+1+i];
                }

		int i=0;
		int j=0;
		int k=start;

		while(i<arr1.length && j<arr2.length){
		
			if(arr1[i]<arr2[j]){
				arr[k]=arr1[i];
				i++;
			}else{
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}

		while(i<arr1.length){
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length){
                        arr[k]=arr2[j];
                        j++;
                        k++;
                }
	
	}
	void mergeSort(int arr[],int start,int end){
		if(start<end){	
			int mid=start+(end-start)/2;

			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);

			merge(arr,start,mid,end);
		}
	}

	public static void main(String[] args){
		Demo obj=new Demo();
		int arr[]=new int[]{7,4,2,8,3,6,9};
		int start=0;
		int end=arr.length-1;

		obj.mergeSort(arr,start,end);

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

/*
2
3
4
6
7
8
9*/
