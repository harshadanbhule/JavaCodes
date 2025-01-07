import java.util.*;

class Demo{

	int fun(int arr[],int num){ 
		for(int i=0;i<arr.length;i++){                                                                                          	if(num==arr[i]){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size =sc.nextInt();

		int arr[]=new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("enter number :");
		int num=sc.nextInt();

		Demo obj=new Demo();

		int ans=obj.fun(arr,num);
		if(ans==-1){
			System.out.println("element not in array");
		}else{
			System.out.println("Index : "+ ans);
		}
	}
}
