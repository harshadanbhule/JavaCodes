/*Write a program to print the square of the first 10 natural numbers in reverse
manner.
Output : 100 81 64 49 36 25 16 9 4 1*/

class Demo {
    public static void main(String[] args) {
        int num = 10;

        while (num >= 1) {
       
            System.out.println(num*num);

            num--;
        }
    }
}
