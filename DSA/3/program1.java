import java.util.*;

class Demo{

	static int funSum(int num){
		int sum=0;
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		int inputNum=sc.nextInt();
		int result=funSum(inputNum);
		System.out.println("Sum : "+result);
	}
}
