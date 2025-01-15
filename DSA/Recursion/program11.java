//fibonacci sreies using recusion

class Demo{
        int fun(int num){
                if(num<=1){
                        return num;
                }
                return fun(num-1)+fun(num-2);
        }
        public static void main(String[] args){
                int input=8;
                Demo obj=new Demo();
		for(int i=0;i<input;i++){
			System.out.println(obj.fun(i));
		}
			
        }
}

/*
0
1
1
2
3
5
8
13*/
