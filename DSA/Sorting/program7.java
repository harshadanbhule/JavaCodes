//Quick sort
import java.util.*;
class QuickSort{
	int partition(int arr[],int start,int end){
		int pivot=arr[end];
		int i=start-1;

		for(int j=start;j<end;j++){
			if(arr[j]<=pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}

		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;

		return i+1;
	}

	void quickSort(int arr[],int start,int end){
	
		if(start<end){
			int pivotIdx=partition(arr,start,end);

			quickSort(arr,start,pivotIdx-1);
			quickSort(arr,pivotIdx+1,end);
		}
	}
	public static void main(String [] args){
		
		int arr[]=new int[]{12,7,6,14,5,15,10};
		QuickSort obj=new QuickSort();
		obj.quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
}
