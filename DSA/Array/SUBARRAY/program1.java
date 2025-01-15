// find number of subarray 
import java.util.*;

class Demo{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int count =0;
		for(int i=0;i<size;i++){
			for(int j=i;j<size;j++){
				count++;
			}
		}

		System.out.println("count is"+count);
	}

}
