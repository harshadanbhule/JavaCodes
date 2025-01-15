//find square root of number

import java.util.*;

class Demo{
        static int facto(int num){
		int number=0;
                for(int i=1;i*i<=num;i++){

                        	if(i*i==num){

					number=i;
					break;
				}
                        }
		return number;

        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
                int ans=facto(num);
                System.out.println("Square root :"+ans);

        }
}
