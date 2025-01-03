//given an array of size N
//find the given n size  subarray count (optimized)
import java.util.*;

class Demo{

        static int answer(int[] arr,int k){

                int count =0;
                int size=arr.length;
		if(k==0){
			return 0;
		}
                for(int i=0;i<=size-k;i++){
                       count++;
                }
                return count;
        }

        public static void main(String[] args){
                Scanner sc =new Scanner (System.in);

                int arr[]=new int[]{-3,4,-2,5,3,-2,8,2,1,4};

                int k=sc.nextInt();
		System.out.println(arr.length-k+1);
                int ans =answer(arr,k);
                System.out.println(ans);
        }
}

/*
 
   we can directly write 
   one line code to get count

   System.out.println(arr.length-k+1);

 input is 3 then output is 8*/
