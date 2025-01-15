// find all  subarray
import java.util.*;

class Demo{

        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int size=sc.nextInt();
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                
                for(int i=0;i<size;i++){
                        for(int j=i;j<size;j++){
				for(int k=i;k<=j;k++){
                                System.out.print(arr[k]);
				}
				System.out.print(",");
			}
			System.out.println("");
		}
        }

}


/*
 4
1
2
3
4
1,12,123,1234,
2,23,234,
3,34,
4,*/
