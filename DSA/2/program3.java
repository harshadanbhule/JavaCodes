
//find square root of number(more ptimized)

import java.util.*;

class Demo{
        static int facto(int num){
                int start=1;
                int end=num;
		int ans=0;
                while(start<=end){
			int mid=(start+end)/2;
			int sqr=mid*mid;

			if(sqr==num){
				return mid;
			}

			if(sqr>num){
				end=mid-1;
			}else{
				ans=mid;
				start=mid+1;
			}
		}
		return ans;

        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
                int ans=facto(num);
                System.out.println("Square root :"+ans);

        }
}
