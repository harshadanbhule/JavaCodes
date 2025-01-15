//tribonachi series


import java.util.Scanner;

public class TribonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the position (n): ");
        int n = sc.nextInt();  // nth position
        
        long tribNumber = getTribonacciNumber(n);
        System.out.println("Tribonacci number at position " + n + " is: " + tribNumber);
        
        sc.close();
    }
    
    // Iterative method to find the Tribonacci number at the nth position
    public static long getTribonacciNumber(int n) {
        if (n <= 0) {
            return -1; // Handle invalid input (n should be >= 1)
        }
        if (n == 1) return 0;  // First term is 0
        if (n == 2 || n == 3) return 1;  // Second and third terms are 1
        
        long t1 = 0, t2 = 1, t3 = 1, trib = 0;
        
        for (int i = 4; i <= n; i++) {
            trib = t1 + t2 + t3;
            t1 = t2;
            t2 = t3;
            t3 = trib;
        }
        
        return trib;
    }
}

