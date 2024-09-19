/*
 fibonachi*/


import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the position (n): ");
        int n = sc.nextInt();  // nth position

        long fibNumber = getFibonacciNumber(n);
        System.out.println("Fibonacci number at position " + n + " is: " + fibNumber);

        sc.close();
    }

    // Iterative method to find the Fibonacci number at the nth position
    public static long getFibonacciNumber(int n) {
        if (n <= 0) {
            return -1; // Handle invalid input (n should be >= 1)
        }
        if (n == 1 || n == 2) {
            return 1; // First two Fibonacci numbers are 1
        }

        long a = 1, b = 1;
        long fib = 1;

        for (int i = 3; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }
}

