
//find square root of number(Optimized)

import java.util.*;

class Demo{
        static int facto(int num){
		int count=0;
                int number=0;
                for(int i=1;i*i<=num;i++){
			count++;
                                if(i*i<=num){

                                        number=i;
                                }else{
					break;
				}
                        }
		System.out.println("Count : "+count);
                return number;

        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
                int ans=facto(num);
                System.out.println("Square root :"+ans);

        }
}
