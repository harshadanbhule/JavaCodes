/*10.Write a program to print the numbers in the range 100 - 24 which are divisible by
4 & 5.
Output: 100,80,60,40*/

class Demo {
    public static void main(String[] args) {
        int num = 100;
        int sum =0;

        while (num >= 24){
            if(num%4 ==0 && num%5==0){
                System.out.println(num);
            }
            num--;
        }
    }
}
