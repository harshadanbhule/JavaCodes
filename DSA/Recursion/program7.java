//sum of digits number given by user

class Demo{
        int fun(int num){
                if(num==0){
                        return 0;
                }
                return num%10+ fun(num/10);
        }

        public static void main(String[] args){
                Demo obj=new Demo();
                int ret=obj.fun(5);
                System.out.println(ret);
        }
}

/*
 input =123
 output=6*/
