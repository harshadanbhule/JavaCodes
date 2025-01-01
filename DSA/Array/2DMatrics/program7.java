// print right diagonal of the square matrix


class Demo{
        public static void main(String[] args){

                int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};

                int i=0;
		int j=arr.length-1;

		while(i<arr.length && j>=0){
			System.out.println(arr[i][j]);
			i++;
			j--;
		}

        }
}

/*
 3
5
7*/
