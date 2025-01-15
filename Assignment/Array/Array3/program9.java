/*
Q9.
Print the prime numbers in an array.
5 7 9 11 15 19 90
Output:
5 7 11 19*/

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Output: ");
        for(int j=0;j<size;j++){
                
		if( prime(arr[j])){
			System.out.println(arr[j]);
		}
        }
    }
    public static boolean prime(int num){
    	if(num<1){
		return false;
	}else{
		for(int i =2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
	}
	return true;
    }
}
