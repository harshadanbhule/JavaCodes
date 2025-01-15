/*1. WAP in notebook & Dry run first then type
Take number of rows from user :
Rows = 3
1
1 2
1 2 3
Rows = 4
1
1 2
1 2 3
1 2 3 4*/
import java.util.*;
class Demo{

	public static void main(String[] args){
		System.out.print("Enter number of rows : ");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}
