//prime num addition
import java.util.*;
class Demo{
        static boolean checkPrime(int num){
                if(num<2){
                        return false;
                }

                for(int i=2;i<num;i++){
                        if(num%i==0){
                                return false;
                        }
                }
                return true;
        }
        static int answer(int start,int end){
                int sum=0;
                for(int i=start;i<=end;i++){
                        if(checkPrime(i)){
                                sum+=i;
                        }

                }
                return sum;
        }
        public static void main(String [] args){
                //Scanner sc=new Scanner(System.in);
                int start=1;
                int end=10;

                int result=answer(start,end);
                System.out.println(result);
        }
}
