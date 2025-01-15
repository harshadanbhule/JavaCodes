class Demo{
        void numPrint(int num){
                if(num==0)
                        return;
                numPrint(--num);
                System.out.println(num);

        }
        public static void main(String[] args){
                Demo obj =new Demo();
                obj.numPrint(10);
        }

}
                                                                                                                     
