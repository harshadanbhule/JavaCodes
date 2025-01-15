/*Write a program to check whether the given number is odd or even.
Input : 45
Output : 45 is an odd number.*/

class Demo{
	
	public static void main(String[] args){
	int num = 45;

	switch (num % 2) {
            case 0:
                System.out.println(num + " is an even number.");
                break;
            case 1:
		System.out.println(num + " is an odd number.");
		break;
            case -1: 
                System.out.println(num + " is an odd number.");
                break;
        }
	}

}
