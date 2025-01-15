/*8. Write a program to check whether the student passed with:
first class with distinction, first class, second class, pass and fail according to his percent
grades. (You have to adjust range by your own for first class, second class and for pass)
Input 1: percent= 85.00
Output: Passed : first class with distinction
Input 2: percent=75.00
Output: Passed : first class with distinction
Input 3: percent=60.00
Output: Passed : first class

Input 4: percent=54.00
Output: Passed : second class
Input: percent=47
Output: Pass*/



class Demo{
	public static void main(String[] args) {
        	double percent = 85.00;

        if (percent >= 85.00) {
            System.out.println("Passed: First class with distinction");
        } else if (percent >= 60.00) {
            System.out.println("Passed: First class");
        } else if (percent >= 50.00) {
            System.out.println("Passed: Second class");
        } else if (percent >= 40.00) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}

