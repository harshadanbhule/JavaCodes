/*9 B 7 D 5 F 3 H 1*/

class Demo{

        public static void main(String[] args){
		int num=56;
                for(int i=9;i>=1;i--){
                        if(i%2==0){
                                System.out.print((char)(i+num)+" ");
                        }else{
                                System.out.print(i+" ");
                        }
		num+=2;
		
                }
        }
}
