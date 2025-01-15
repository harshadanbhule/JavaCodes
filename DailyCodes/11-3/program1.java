import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size for rows and columns : ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];

		System.out.println("Enter array's elments : ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("array's elments are : ");

		for(int i=0;i<arr.length;i++){   
			for(int j=0;j<arr[i].length;j++){    
			System.out.print(arr[i][j]+" "); 
			}        
			System.out.println("");
		}

	}
}
