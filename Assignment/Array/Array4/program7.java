/*
 Q7. WAP to convert lowercase characters to UPPERCASE characters.(Take input from
the user)
Example:
Input:
Enter the size of the array:
6
Enter the elements of the array:
a
B
Y
p
o
H
Output:
A B Y P O H*/


import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        char[] arr = new char[size]; 

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.next().charAt(0); 
        }

        for (int i = 0; i < size; i++) {
            char c = arr[i];
            if (Character.isLowerCase(c)) {
                arr[i] = Character.toUpperCase(c);
            }
        }

        System.out.println("Output:");
        for (int j=0;j<size;j++) {
            System.out.println(arr[j]);
        }
    }
}

