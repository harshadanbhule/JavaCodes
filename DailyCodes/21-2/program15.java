/*
1 2 3
3 2 1
1 2 3
3 2 1
1 2 3
3 2 1*/

class Demo{

        public static void main(String[] args){
                int row=6;
                for(int i=row;i>=1;i--){
			int num=3;
                        for(int j=1;j<=3;j++){
				if(i%2!=0){
                                	System.out.print(num+" ");
				}else{
					System.out.print(j+" ");
				}
				num--;
                        }
                        System.out.println("");
                }
        }
}
