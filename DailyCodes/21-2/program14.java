/*
9 8 7
6 5 4
3 2 1*/

class Demo{

        public static void main(String[] args){
                int row=3;
		int num=row*row;
                for(int i=1;i<=row;i++){
                        for(int j=row;j>=1;j--){
                                System.out.print(num+" ");
			num--;
                        }
                        System.out.println("");
                }
        }
}
