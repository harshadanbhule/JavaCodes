/*8. Write a program to print the given pattern
rows=3
1
1 c
1 e 3

rows=4
1
1 c
1 e 3
1 g 3 i*/


import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
		int num=1;
                for(int i=1;i<=row;i++){
       
                        for(int j=1;j<=i;j++){
                                if(j%2!=0){
                                        System.out.print(j+" ");
                                }else{
                                        System.out.print((char)(num+98)+" ");
					num+=2;
                                }
				
                                
                        }
                        System.out.println(" ");
                }
        }
}
