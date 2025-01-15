class Demo{
	

	void do2(){
		static int x=10;
	}
System.out.println(x);
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.do2();
	}
}
