/*
 Given an array of integers, you need to count the number of unique pairs of elements that sum up to exactly 60. For example, if the array is [2, 50, 50, 2, 60, 60], you would count pairs like (2, 58) if it were in the array, but in this specific array, you should only count pairs where the sum equals 60.*/


import java.util.Scanner;

public class CountPairsBruteForce {

    public static int countPairs(int[] arr) {
        int count = 0;
        int n = arr.length;

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == 60) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Number of pairs that sum up to 60 minutes: " + countPairs(arr));
    }
}

