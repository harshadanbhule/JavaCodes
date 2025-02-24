//factorial of number


import java.util.*;

class Demo{
	
        int answer(int input){
               
		if(input==0){
			return 1; 
		}

		return input*answer(input-1);
        }
        public static void main(String[] args){
                Scanner sc =new Scanner(System.in);
                int input=sc.nextInt();

                Demo obj=new Demo();
                int result=obj.answer(input);
		System.out.println(result);
        }
}
