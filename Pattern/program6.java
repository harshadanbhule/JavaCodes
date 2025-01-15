class Demo{

	public static void main(String [] args){
		for(int i=1;i<=5;i++){
		nt count=1;	
			for(int j=0;j<=4;j++){
				
				if(j<=i){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
