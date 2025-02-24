//check string is palindrome or not

import java.util.*;

class Demo{

        boolean answer(String input){

            	char arr[]=input.toCharArray();
		String reverse="";
		for(int i=arr.length-1;i>=0;i--){
			reverse+=arr[i];
		}
		if(reverse.equals(input)){

			return true;
		}
	
                return false;
        }
        public static void main(String[] args){
                Scanner sc =new Scanner(System.in);
                String input=sc.nextLine();

                Demo obj=new Demo();
                boolean result=obj.answer(input);
                

		if(result){
			System.out.println("is palindrome");
		}else{
			System.out.println("is not palindrome");
		}
        }
}

/*
 haeeah
is palindrome*/
