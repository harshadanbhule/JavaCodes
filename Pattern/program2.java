class Demo{
        public static void main(String[] args){
        for(int i=1;i<=4;i++){
		char letter1 = 'A';
		char letter2 = 'a';
                for(int j=1;j<=4;j++){

                        if(i%2==0){
                        System.out.print(letter2 + " ");
                        letter2++;
                        }else{
                        System.out.print(letter1 + " ");
                        letter1++;
                        }


                }
                 System.out.println( " ");

        }

        }
}
