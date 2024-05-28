/*
 Q10.
Write a program to print the product of prime elements in an array.
1 4 5 6 11 9 10
Output:
55*/

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
	int product=1;
        System.out.println("Output: ");
        for(int j=0;j<size;j++){

                if( prime(arr[j])){
                        product*=arr[j];
                }
        }
	System.out.println(product);
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
