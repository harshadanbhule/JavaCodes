/*10. WAP in notebook & Dry run first then type
Take number of rows from user :
rows = 4

65 B 67 D
B 67 D
67 D
D
rows = 3
A 66 C
66 C
C*/


import java.util.*;
class Demo{

        public static void main(String[] args){
                System.out.print("Enter number of rows : ");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                int num1=0;
                for(int i=row;i>=1;i--){
                        int num2=65;
                        for(int j=i;j>=1;j--){
				if(j%2==0){
					System.out.print(num2+num1+" ");
				}else{
					System.out.print((char)(num2+num1)+" ");
				}
                                
                   		num2++;

                        }
                        num1++;

                        System.out.println(" ");
                }
        }
}
