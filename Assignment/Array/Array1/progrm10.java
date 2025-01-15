/*
 10. Write a real-time example where you have to use the array. Take input from the user.*/

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int size = sc.nextInt();

        int[] grades = new int[size];

        System.out.println("Enter the grades of the students: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Grade of student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        System.out.println("Grades of students:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade of student " + (i + 1) + ": " + grades[i]);
        }

        System.out.println("Students who have passed:");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 50) {
                System.out.println("Student " + (i + 1) + " has passed with grade: " + grades[i]);
            }
        }

    }
}

