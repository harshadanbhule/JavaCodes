/*Write a program to print the countdown of days to submit the assignment

Input : day = 7
Output: 7 days remaining
6 days remaining
5 days remaining
.
.
1 days remaining
0 days Assignment is Overdue*/

class Demo {
    public static void main(String[] args) {
        int num = 7;

        while (num >= 0) {

            System.out.println(num+" days remaining");

	    if(num==0){
	    	System.out.println(num+" days Assignment is Overdue");
	    }

            num--;
        }
    }
}
