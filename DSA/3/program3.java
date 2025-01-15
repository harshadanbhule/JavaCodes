
import java.util.*;

class Demo{

        static int funSum(int num){
                return (num*(num+1))/2;
        }

        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                int inputNum=sc.nextInt();
                int result=funSum(inputNum);
                System.out.println("Sum : "+result);
        }
}
