/*Write a program to check whether the given number is divisible by 3 or 7.
Input: 15
Output: 15 is divisible by 3

Input: 28
Output: 28 is divisible by 7
Input: 20
Output: 20 is neither divisible by 3 nor by 7.*/


class Demo{
        public static void main(String[] args){
        int num=28;


        if(num%7==0){
                System.out.println(num + " is divisible by 7");
        }else if (num%3==0){
                System.out.println(num + " is divisible by 3");
        }else{
                System.out.println(num + " is not divisible by 3 & 7");
        }

        }

}
