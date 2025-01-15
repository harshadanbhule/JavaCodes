// print 2D matix  iterare through entier matrix column by column


class Demo{
        public static void main(String[] args){
                int arr[][]=new int[][]{{1,2,3,4},{2,3,4,5},{3,4,5,6}};

                for(int i=0;i<arr[0].length;i++){
                        for(int j=0;j<arr.length;j++){
                                System.out.print(arr[j][i]+" ");
                        }
                        System.out.println(" ");
                }
        }
}
/*
1 2 3
2 3 4
3 4 5
4 5 6*/                                                                                                                                                   */
