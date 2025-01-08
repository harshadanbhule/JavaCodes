//Binary seraching using recursion

import java.util.*;

class Demo{

        int fun(int arr[],int start,int end,int num){

		if(start>end){
			return -1;
		}else{
                        int mid=start+end/2;

                        if(arr[mid]==num){
                                return mid;
                        }
                        if(arr[mid]<num){
                                return fun(arr,mid+1,end,num);
                        }else{
                                return fun(arr,start,mid-1,num);
                        }
		}		
               
        }

        public static void main(String [] args){
                Scanner sc=new Scanner(System.in);
                Demo obj=new Demo();

                int arr[]=new int[]{4,8,9,11,13,19};
                System.out.println("Enter number : ");
                int num=sc.nextInt();
		int end=arr.length-1;
                int start=0;

                int ans=obj.fun(arr,start,end,num);
                if(ans==-1){
                        System.out.println("Number not found");
                }else{
                        System.out.println(ans);
                }


        }
}

/*
Enter number :
4
0*/
