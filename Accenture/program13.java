/*
 You are given a function,
int findCount(int arr[], int length, int num, int diff);

The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.
Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

Example:
Input:

arr: 12 3 14 56 77 13
num: 13
diff: 2
Output:
3

Explanation:
Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14.*/


public class FindCount {

    // Function to find the number of elements with an absolute difference <= diff
    public static int findCount(int arr[], int length, int num, int diff) {
        // Initialize a counter to track the number of elements that satisfy the condition
        int count = 0;

        // Iterate through the array
        for (int i = 0; i < length; i++) {
            // Manually calculate the absolute difference
            int difference = arr[i] - num;
            if (difference < 0) {
                difference = -difference; // Convert negative difference to positive
            }

            // Check if the difference is less than or equal to diff
            if (difference <= diff) {
                count++; // Increment the counter if the condition is satisfied
            }
        }

        // If no element satisfies the condition, return -1
        if (count == 0) {
            return -1;
        }

        // Return the count of elements that satisfy the condition
        return count;
    }

    public static void main(String[] args) {
        // Example test case
        int[] arr = {12, 3, 14, 56, 77, 13};
        int num = 13;
        int diff = 2;
        int length = arr.length;

        // Call the function and print the result
        int result = findCount(arr, length, num, diff);
        System.out.println("Output: " + result);  // Output: 3
    }
}

