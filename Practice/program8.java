class Demo{
	public static void main(String [] args){
		int num=8;
		int a=0;
		int b=1;
		int c=0;

		for(int i=2;i<=num;i++){
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}
}
