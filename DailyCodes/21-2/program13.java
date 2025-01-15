/*
4 3 2 1
4 3 2 1
4 3 2 1
4 3 2 1
*/

class Demo{

        public static void main(String[] args){
                int row=4;
                for(int i=1;i<=row;i++){		
                        for(int j=row;j>=1;j--){
                                System.out.print(j+" ");
                        }
                        System.out.println("");
                }
        }
}
