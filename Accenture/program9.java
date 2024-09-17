/*
 return the average of array element divisible by 2 and 3*/



import java.util.Scanner;

public class AverageDivisibleBy6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        int n = sc.nextInt();

        // Array to store the input numbers
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize sum and count
        int sum = 0;
        int count = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Check if the number is divisible by 6
            if (arr[i] % 6 == 0) {
                sum += arr[i];
                count++;
            }
        }

        // Calculate the average and print the result
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println(average);
        } else {
            // Handle case where no elements are divisible by 6
            System.out.println(0);
        }

        sc.close();
    }
}

