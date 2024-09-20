class Child{
        int x=20;
	int y=10;
        Child(int x,int y){
                System.out.println("Child Constructor");
                System.out.println(x);
                System.out.println(y);
                //System.out.println(this.x);
                //system.out.println(this.y);
            
                //this.y=y;
        }
        void run(){
                System.out.println(x);
                System.out.println(y);
        }
        public static void main(String []args){
                Child obj=new Child(30,40);
                obj.run();
                //System.out.println(obj.x);
                //System.out.println(obj.y);
        }

}
/*Child Constructor
30
40
20
10*/
