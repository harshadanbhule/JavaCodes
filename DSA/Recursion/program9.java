//reverse string using recursion

class Demo{
	String fun(String str){
		if(str==null || str.length()<=1){
			return str;
		}

		return fun(str.substring(1))+str.charAt(0);
	
	} 
	public static void main(String [] args){
		String str="Hello";
		Demo obj=new Demo();
		String rev=obj.fun(str);
		System.out.println(rev);
	
	}
}

//olleH
