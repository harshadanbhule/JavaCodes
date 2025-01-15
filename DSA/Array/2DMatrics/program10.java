//given square matrix of size n x n 
//rotate tehe matrix form top right corner  90 degree clockwise 
//Note : no new matrix


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
			for(int j=0;j<size/2;j++){
				int temp=arr[i][size-j-1];
				arr[i][size-j-1]=arr[i][j];
				arr[i][j]=temp;
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
21 16 11 6 1
22 17 12 7 2
23 18 13 8 3
24 19 14 9 4
25 20 15 10 5*/
