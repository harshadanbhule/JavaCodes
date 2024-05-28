/*
1 2 3
D E F
7 8 9
J K L*/

class Demo{

        public static void main(String[] args){
                int num=1;
                for(int i=1;i<=4;i++){
                       
                        for(int j=1;j<=3;j++){
                                if(i%2!=0){
                                        System.out.print(num+" ");
                                }else{
                                        System.out.print((char)(num+64)+" ");
                                }
                                num++;
                        }
                        System.out.println("");
                }
        }
}
