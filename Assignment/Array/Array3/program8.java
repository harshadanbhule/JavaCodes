/*
 Print the composite numbers in an array.
4 5 7 9 10

Output:
4 9 10*/

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
		int count =0;
		if(arr[j]>1){
			for(int i=1;i<=arr[j];i++){
				if(arr[j]%i==0){
					count++;
				}
			}
		if (count > 2) {
                    System.out.println(arr[j]);
		}
	}
    
	}
    }
}

