/*Write a program to print the numbers divisible by 4 and 7 in the range 50 - 100*/

class Demo {
    public static void main(String[] args) {
        int num = 50;

        while (num <= 100) {
        if(num%4==0&&num%7==0){
            System.out.println(num);

          }

            num++;
        }
    }
}

