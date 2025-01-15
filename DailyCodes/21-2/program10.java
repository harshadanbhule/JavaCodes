/*A b C d E f G h I*/

class Demo{

        public static void main(String[] args){
                char ch =65;
                for(int i=1;i<=9;i++){
                        if(i%2==0){
                                System.out.print((char)(ch+32)+" ");
                        }else{
                                System.out.print(ch+" ");
                        }
                ch++;

                }
        }
}
