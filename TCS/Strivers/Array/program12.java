//Find all repeating elements in an array

class Demo{
	static int[] answer(int[] arr){
		int size=arr.length;
		int rep[]=new int[size];
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			boolean duplicate=false;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					duplicate=true;
					break;
				}
			}
			boolean same=false;
			for(int j=0;j<count;j++){
				if(arr[i]==arr[j]){
					same=true;
				}
			}

			if(duplicate  && !same  ){
				rep[count]=arr[i];
				count++;
			}
		}
		return rep;
		
	}
	public static void main(String[] args){
		int arr[]={1,1,2,3,4,4,5,2};
		int arr1[]=answer(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr1[i]);
		}
	}
}
