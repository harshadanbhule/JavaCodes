/*Write a program to print the cube of the first 10 natural numbers.
Output : 1 8 27 64 125 216 343 512 729 1000*/

class Demo {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 10){
                System.out.println(num*num*num);
            num++;
        }
    }
}
