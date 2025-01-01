// print sum of entire matrix


class Demo{
        public static void main(String[] args){

                int arr[][]=new int[][]{{1,2,3,4},{2,3,4,5},{3,4,5,6}};
		int sum=0;
                for(int i=0;i<arr[0].length;i++){
                        for(int j=0;j<arr.length;j++){
                                sum+=arr[j][i];
                        }
                      
		}
		System.out.println(sum);
        }
}

//o/p=42
