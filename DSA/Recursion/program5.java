//sum upto n given number by user

class Demo{
	int fun(int num){
		if(num==1){
			return 1;
		}
		return num+fun(--num);	
	}
	
	public static void main(String[] args){
		Demo obj=new Demo();
		int ret=obj.fun(5);
		System.out.println(ret);	
	}
}
//o/p=15
