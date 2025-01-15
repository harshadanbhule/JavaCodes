/*
Q7
Check the size of the array and if array size is odd and greater than or equal to 5, then
print the odd elements, else print the even numbers.
Example 1:
Size : 6
121 144 225 88 90 89
Output:
144 88 90
Example:
Size : 5
1 625 196 169 7
Output:
1 625 169 7 */

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
        if (size >= 5 && size % 2 != 0) {
            for (int i = 0; i < size; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}

