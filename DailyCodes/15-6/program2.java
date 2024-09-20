class Outer{
        static int x=10;
        int y=20;
        static void run(){
                System.out.println("In static method");
        }
        void fun(){
                System.out.println("In fun");
        }
        class Inner{
                Inner(){
                        System.out.println(y);
                        Outer.run();
                }
        }

}

class Client{
        public static void main(String[] args){
                Outer.Inner obj=new Outer().new Inner();
        }
}
