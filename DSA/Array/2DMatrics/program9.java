//given square matrix of size n x n convert the matrix to its transpose matrix


class Demo{
        public static void main(String [] args){

                int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

                int size=arr.length;

                for(int i=0;i<size;i++){
                        for(int j=i+1;j<size;j++){

                                int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;

                         }
                       
                }
		for(int i=0;i<size;i++){
                        for(int j=0;j<size;j++){

                                System.out.print(arr[i][j]+" ");

                         }
                        System.out.println("");
                }
        }
}
/*
 1 6 11 16 21
2 7 12 17 22
3 8 13 18 23
4 9 14 19 24
5 10 15 20 25*/
