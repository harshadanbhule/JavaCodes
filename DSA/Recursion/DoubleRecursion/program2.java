class Demo{
        void fun(int num){
                if(num<=1){
                        return;
                }
                fun(num-2);
		System.out.println(num);
		fun(num-1);
        }

        public static void main(String[] args){
                Demo obj=new Demo();
                obj.fun(5);
        }
}

/*
 O/P: 
3
2
5
2
4
3
2*/
