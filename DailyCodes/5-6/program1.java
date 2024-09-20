class Parent{
        int x=10;
        Parent(){
                System.out.println("Parent constructor");
        }
}
class Child extends Parent{
        int y=20;
        Child(int x,int y){
                System.out.println("Child Constructor");
                System.out.println(x);
                System.out.println(y);
                System.out.println(this.x);
                System.out.println(this.y);
                this.x=x;
                this.y=y;
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
/*
 * Parent constructor
Child Constructor
30
40
10
20
30
40*/
