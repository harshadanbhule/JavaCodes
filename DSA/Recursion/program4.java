 class Demo{
	int fun(int num){                                                                                                               if(num==0)
                	return 1;

                return 5+ fun(--num);                                                                                           }  
 	public static void main(String[] args){
		System.out.println("Start main");
		Demo obj =new Demo();
		int ret=obj.fun(2);
		System.out.println(ret);
		System.out.println("End main");
	} 
 }
