class Demo{
        int fun(int num){
                if(num<=1){
                        return 1;
                }
                return fun(num-2)+fun(num-1);
        }

        public static void main(String[] args){
                Demo obj=new Demo();
                int ret=obj.fun(5);
                System.out.println(ret);
        }
}

//o/p=8
