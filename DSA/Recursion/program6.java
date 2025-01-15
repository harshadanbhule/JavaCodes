//sum of digits

class Demo{
	int sum=0;
        int fun(int num){
                if(num==0){
                        return 1;
                }

		int temp=num%10;
		sum+=temp;
		num=num/10;
		fun(num);
                return sum;
        }

        public static void main(String[] args){
                Demo obj=new Demo();
                int ret=obj.fun(1234);
                System.out.println(ret);
        }
}
/*
input : 1234
o/p : 10
1+2+3+4=10*/
