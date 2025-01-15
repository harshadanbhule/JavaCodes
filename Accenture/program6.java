/*
 Given 2 numbers, dice and num, if dice is even then print the sum of digits in odd index, if dice is odd then print the sum of digits in even index
ex
dice = 2
num= 1234 0123*/



public class Main {
    public static void main(String[] args) {
        int dice = 2;  // Example dice
        String num = "12340123";  // Example number

        int sum = 0;
        int length = num.length();

        if (dice % 2 == 0) {
            // dice is even, sum the digits at odd indices (1-based index)
            for (int i = 1; i < length; i += 2) {
                // Convert character at position i to integer
                sum += num.charAt(i) - '0';
            }
        } else {
            // dice is odd, sum the digits at even indices (1-based index)
            for (int i = 0; i < length; i += 2) {
                // Convert character at position i to integer
                sum += num.charAt(i) - '0';
            }
        }

        System.out.println("The sum is: " + sum);
    }
}





//or
public class Main {
    public static void main(String[] args) {
        int dice = 2;  // Example dice
        int[] numArray = {1, 2, 3, 4, 0, 1, 2, 3};  // Example int array

        int sum = 0;
        int length = numArray.length;

        if (dice % 2 == 0) {
            // dice is even, sum the values at odd indices (0-based index)
            for (int i = 1; i < length; i += 2) {
                sum += numArray[i];
            }
        } else {
            // dice is odd, sum the values at even indices (0-based index)
            for (int i = 0; i < length; i += 2) {
                sum += numArray[i];
            }
        }

        System.out.println("The sum is: " + sum);
    }
}

