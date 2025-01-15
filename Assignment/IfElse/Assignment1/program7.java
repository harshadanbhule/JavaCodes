/*7. Write a program to find the maximum between two distinct numbers. (take hardcoded
values)
Input 1:
num1 = 5
num2 = 9
Output: 9 is maximum between 5,9
Input 1:
num1 = 1
num2 = 2
Output: 2 is maximum between 1,2*/

class Demo{
        public static void main(String[] args){
        int num1=5;
	int num2=9;

        if(num1>num2){
                System.out.println(num1 + " is maximum between "+num1+","+ num2);
        }else{
                System.out.println(num2 + " is maximum between "+num1+","+ num2);
        }

        }

}
