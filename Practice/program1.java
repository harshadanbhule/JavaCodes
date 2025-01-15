class p{
	int x=10;
	p(){
		System.out.println("in p");
	}
}
class c extends p{
	int x=20;
        c(){
                System.out.println("in c");
		System.out.println(x);
		System.out.println(super.x);
	}

	void run(){
		System.out.println("in run");
	}
}

class d{
	public static void main(String [] args){
		c obj=new c();
		obj.run();
	}
}
