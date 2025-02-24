//Count frequency of each element in the array

class Demo{

	public static void main(String[] args){
		int arr[] =new int[]{1,2,1,5,2,1,4,5};
 		int visited=-1;
		int visiarr[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
				int count=1;
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]==arr[j]){
						count++;
						visiarr[j]=visited;
					}
				}

				if(visiarr[i]!=visited){
					visiarr[i]=count;
				}
		}
		for(int i=0;i<arr.length;i++){
			if(visiarr[i]!=visited){
				System.out.println(arr[i]+" : "+visiarr[i]);
			}
		}
	}
}

/*
1 : 3
2 : 2
5 : 2
4 : 1*/
