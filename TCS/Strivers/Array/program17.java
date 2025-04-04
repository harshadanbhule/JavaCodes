//Replace elements by its rank in the array
import java.util.*;

class Demo{

	static void answer(int arr[]){

		int temp[]=arr.clone();

		Arrays.sort(temp);
		int rank[]=new int[arr.length];

		for(int i= 0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]==temp[j]){
					rank[i]=j+1;
					break;
				}
			}
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(rank[i]);
		}
	}
	public static void main(String [] args){
		int arr[]={20, 15, 26, 2, 98, 6};

		answer(arr);
	}
}
