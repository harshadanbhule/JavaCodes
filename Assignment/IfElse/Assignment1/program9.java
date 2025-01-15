/*9. Write a program to check the day number(1-7) and print the corresponding day of week.
Input : 1
Output: Monday
Input : 7
Output: Sunday
Input : 8
Output: day number must be between 1 to 7!!!!*/

class Demo{
        
    public static void main(String[] args) {
        
        int num = 7;

        if (num >= 1 && num <= 7) {
            switch (num) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("invalid number");
            }
        } else {
            System.out.println("day number must be between 1 to 7!!!!");
        }
    

        }

}
