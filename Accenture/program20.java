/*To add two binary numbers represented as strings in Java, you can use the Integer.parseInt method to convert them from binary to decimal, perform the addition, and then convert the result back to binary.*/


import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two binary numbers
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        // Add the binary numbers
        int sum = Integer.parseInt(num1, 2) + Integer.parseInt(num2, 2);

        // Print the result in binary
        System.out.println(Integer.toBinaryString(sum));

        scanner.close();
    }
}

