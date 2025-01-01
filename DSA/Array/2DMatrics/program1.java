// print 2D matix  iterare through entier matrix row by row


class Demo{
	public static void main(String[] args){
		int arr[][]=new int[][]{{1,2,3,4},{2,3,4,5},{3,4,5,6}};

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		} 
	}
}

/*
 1 2 3 4
2 3 4 5
3 4 5 6*/
