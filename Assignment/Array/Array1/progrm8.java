/*
 8. Write a program where you have to store the employee’s age working at a company,
take count of employees from the user.Take input from the user.*/


import java.util.*;

public class EmployeeAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int count = sc.nextInt();

        int[] employeeAges = new int[count];

        System.out.println("Enter the ages of the employees: ");
        for (int i = 0; i < count; i++) {
            employeeAges[i] = sc.nextInt();
        }

        System.out.println("Ages of the employees: ");
        for (int i = 0; i < count; i++) {
            System.out.println(employeeAges[i]);
        }

    }
}

