// find sum of each sub array and print  using prefix sum
import java.util.*;
class Demo{

        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int size=sc.nextInt();
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }

                int prefsum[]=new int[size];
                prefsum[0]=arr[0];

                for(int i=1;i<size;i++){
                        prefsum[i]=prefsum[i-1]+arr[i];
                }
                for(int i=0;i<size;i++){
                        for(int j=i;j<size;j++){
				int sum=0;
				if(i==0){
					sum=prefsum[j];
				}else{
					sum=prefsum[j]-prefsum[i-1];
				}
				System.out.print(sum+" ");
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
1,3,6,10,
2,5,9,
3,7,
4,

time complexity =0(n^2)
space complexity =0(n)*/
