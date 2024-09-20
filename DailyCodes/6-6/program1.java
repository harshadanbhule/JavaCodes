class Demo{
	int x=0;

	Demo(int x){
		this.x=x;
		System.out.println("Constructor");
	}
	void fun(int x){
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] args){
		Demo obj =new Demo(120);
		Demo obj2=new Demo(150);
		obj.fun(50);
		obj.fun(20);
	}

}

/*
 Constructor
Constructor
50
120
20
120*/
