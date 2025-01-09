//Bubble sort 

class Demo{
	public static void main(String[] args){
		//case 1
		//int arr[]=new int[]{5,2,8,3,7,5,6};
		//case 2
		int arr[]=new int[]{1,2,3,5,4,6,7};
		int size=arr.length;
		int count =0;
		boolean flag;
		for(int i=0;i<size;i++){
			flag=false;
			for(int j=0;j<size-1-i;j++){
				count++;
				if(arr[j]>arr[j+1]){
					flag=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag==false){
				break;
			}
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("count : "+count);
	}
}

/*case 1  2 3 5 5 6 7 8 count : 15
 case 2   1 2 3 4 5 6 7 count : 11
 using flag iteration decreses */
