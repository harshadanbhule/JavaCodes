/*
 Question 3: Password Checker
(Asked in Accenture OnCampus 10 Aug 2022, Slot 3)

You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input 1:
aA1_67
Input 2:
a987 abC012

Output 1:
1
Output 2:
0*/

public class PasswordChecker {

    public static int CheckPassword(char str[], int n) {
        // Condition 1: At least 4 characters
        if (n < 4) {
            return 0;
        }

        // Condition 2: At least one numeric digit
        boolean hasDigit = false;
        // Condition 3: At least one Capital Letter
        boolean hasUppercase = false;
        // Condition 4: Must not have space or slash (/)
        for (int i = 0; i < n; i++) {
            char ch = str[i];

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            if (ch == ' ' || ch == '/') {
                return 0;
            }
        }

        // Condition 5: Starting character must not be a number
        if (Character.isDigit(str[0])) {
            return 0;
        }

        // Check if at least one digit and one uppercase letter are present
        if (hasDigit && hasUppercase) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Test cases
        char[] input1 = "aA1_67".toCharArray();
        char[] input2 = "a987 abC012".toCharArray();

        System.out.println(CheckPassword(input1, input1.length)); // Output: 1
        System.out.println(CheckPassword(input2, input2.length)); // Output: 0
    }
}

