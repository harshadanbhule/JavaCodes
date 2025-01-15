//Maximum number in array


import java.util.*;
class Demo{

        public static int answer(int [] arr,int n){
                int maxele=Integer.MIN_VALUE;
                int secmax=Integer.MIN_VALUE;

                for(int i=0;i<arr.length;i++){
                        if(arr[i]>maxele){
                                //secmax=maxele;
                                maxele=arr[i];
                        }
                }
                
                return maxele;
        }

        public static void main(String [] args){
                Scanner sc=new Scanner(System.in);
                int size=sc.nextInt();

                int[] arr=new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }

                int ans=answer(arr,size);
                System.out.println(ans);
        }
}
