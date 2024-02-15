/*6. Write a program to verify the age of the voter where the age should be positive. (that
means no negative values are allowed, take hardcoded values).
Input 1: 21
Output: Valid age for voting
Input 2: -31
Output: Invalid age*/

class Demo{
        public static void main(String[] args){
                int num = 21;

                if(num>=18){
                        System.out.println(" Valid age for voting");
                }else{
                        System.out.println("Invalid age");
                }

        }
}
