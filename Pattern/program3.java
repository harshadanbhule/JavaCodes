/*
   *
  * *
 * * *    */

class Demo{
	public static void main(String[] args){
	int m=3;
	for(int i=1;i<=3;i++){
		for(int k=m;k>=1;k--){
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
			System.out.print("* ");
		}
		m--;
		System.out.println("");
	}
	}
}
