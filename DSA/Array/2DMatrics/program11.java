//given n x n matrix 
//print the boundary in clockwise fashion 

class Demo{
        public static void main(String [] args){

                int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

                int size=arr.length;

                for(int j=0;j<size-1;j++){
			int i=0;
                       
			System.out.println(arr[i][j]);
                }
		
                for(int i=0;i<size-1;i++){
			int j=size-1;
                       System.out.println(arr[i][j]);
                }
                for(int j=size-1;j>0;j--){
                   int i=size-1;
		   System.out.println(arr[i][j]);
                       
                }

		for(int i=size-1;i>0;i--){
                   int j=0;
                   System.out.println(arr[i][j]);

                }
        }
}


/*
1
2
3
4
5
10
15
20
25
24
23
22
21
16
11
6*/
