//count of Vowels permutation


import java.util.Scanner;

class VowelPermutations {

    // Method to calculate factorial
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to count permutations
    public static int countPermutations(int n) {
        return factorial(n);
    }

    public static void main(String[] args) {
        // Number of vowels
        int numberOfVowels = 5; // For 'a', 'e', 'i', 'o', 'u'

        // Count permutations of these vowels
        int permutations = countPermutations(numberOfVowels);

        // Print the number of permutations
        System.out.println("Number of permutations of " + numberOfVowels + " vowels: " + permutations);
    }
}

