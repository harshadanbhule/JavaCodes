//given a matrix of size N X M print all the diagonals right to left consider  zeroth row from right 


class Demo{
	public static void main(String [] args){
		
		int arr[][]=new int[][]{{1,2,3,4,5,6},{2,3,4,5,6,7},{3,4,5,6,7,8},{4,5,6,7,8,9}};
		
		int size=arr[0].length;
		int columnsize=arr.length;

		for(int i=size-1;i>=0;i--){
			int j=0;
			int y=i;

			while(j<columnsize && y>=0){
			
				System.out.print(arr[j][y]);

				y--;
				j++;
			}
			System.out.println("");
		}
	}
}

/*
 6666
5555
4444
333
22
1*/
