/*
1 B 3
D 5 F
7 H 9*/

class Demo{

        public static void main(String[] args){
                int num=1;
		char ch=65;
                for(int i=1;i<=3;i++){
                        for(int j=1;j<=3;j++){
                                if(i%2!=0){
                                         if(j%2!=0){
                                        	System.out.print(num+" ");
                                	 }else{
                                        	System.out.print(ch+" ");
                                	 }
                                }else{
                                         if(j%2!=0){
                                        	System.out.print(ch+" ");
                                	 }else{
                                        	System.out.print(num+" ");
                                	 }	 
                                }
                                num++;
				ch++;
                        }
                        System.out.println("");
                }
        }
}
