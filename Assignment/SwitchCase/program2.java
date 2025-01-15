/*Write a program to print Remarks according to their respective grades.
Input : O
Output : Outstanding

Input : A
Output : Excellent*/

class Demo{

        public static void main(String[] args){
        char ch = 'B';

        switch (ch) {
            case 'O':
                System.out.println("Outstanding");
                break;
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Best");
                break;
	    case 'C':
                System.out.println("Better");
                break;
	    case 'D':
                System.out.println("Good");
                break;
	    case 'P':
                System.out.println("Pass");
                break;
	    case 'F':
                System.out.println("Fail");
                break;
        }
        }

}
