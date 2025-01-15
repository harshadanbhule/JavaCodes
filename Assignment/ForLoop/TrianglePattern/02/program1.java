/*Write a program to print the given pattern
rows=3
9
9 9
9 9 9

rows=4
16
16 16
16 16 16
16 16 16 16*/


import java.util.*;
class Demo{

	public static void main(String[] args){
		System.out.print("Enter number of rows : ");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){
				System.out.print(row*row+" ");
			}
			System.out.println(" ");
		}
	}
}
