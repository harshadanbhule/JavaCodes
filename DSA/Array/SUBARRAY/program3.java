// find sum of each sub array and print
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
				int sum=0;
                                for(int k=i;k<=j;k++){
                                sum+=arr[k];
                                }
                                System.out.print(sum+",");
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
4,*/
