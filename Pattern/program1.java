class Demo{
        public static void main(String[] args){
		int num = 1;
                char letter = 'A';
        for(int i=1;i<=4;i++){
                for(int j=1;j<=4;j++){
			
                        if(i%2==0){
                        System.out.print(letter + " ");
                        letter++;
                        }else{
                        System.out.print(num + " ");
                        num++;
                        }


                }
                 System.out.println( " ");

        }

        }
}
