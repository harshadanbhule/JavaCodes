//hcf

import java.util.*;
class Demo{
        static int hcf(int n1,int n2){
                while(n2!=0){
                        int temp=n2;
                        n2=n1%n2;
                        n1=temp;
                }
                return n1;
        }
        
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int n1=sc.nextInt();
                int n2=sc.nextInt();

                int result=hcf(n1,n2);
                System.out.println(result);
        }
}
