// Insertion sort

class Demo{

	public static void main(String [] args){
		int arr[]=new int[]{1,3,2,4,7,6};
		for(int i=1;i<arr.length;i++){
			int j=i-1;
			int element=arr[i];

			while(j>=0 && element<arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;

		}
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
6
7*/
