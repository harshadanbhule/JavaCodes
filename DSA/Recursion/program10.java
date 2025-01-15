//fafibonacci series code using recursion


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
		int ans=obj.fun(input);
		System.out.println(ans);
	}
}

//o/p: 21
