/*Write a program to print the sum of odd numbers from 150 to 101.
Output : 3125*/

class Demo {
    public static void main(String[] args) {
        int num = 101;
        int sum =0;

        while (num <= 150){
            if(num%2 !=0){
	    	sum=sum+num;
	    }
            num++;
        }
        System.out.println(sum);
    }
}
