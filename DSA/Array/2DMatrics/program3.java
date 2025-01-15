// print row wise sum of entire matix


class Demo{
        public static void main(String[] args){
                int arr[][]=new int[][]{{1,2,3,4},{2,3,4,5},{3,4,5,6}};

                for(int i=0;i<arr.length;i++){
			int sum=0;
                        for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
			}
                        System.out.println(sum);
                }
        }
}

/*
 10
14
18*/
