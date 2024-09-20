class Demo{
        int x=0;

        Demo(int x){
                this.x=x;
                System.out.println("Constructor");
        }
        void fun(int x){
                System.out.println(x);
             
        }

        public static void main(String[] args){
                Demo obj =new Demo(120);
               
        }

}
