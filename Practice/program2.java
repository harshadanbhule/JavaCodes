class d{
 static void run(){
 	System.out.println("d");
 }
}
class c{
	public static void main(String[] args){
		d obj=new d();
		d.run();
	}
}
