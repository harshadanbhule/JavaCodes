/*Write a program where you have to print sum of integer from 90 to 11
Output : 4040*/

class Demo {
    public static void main(String[] args) {
        int num = 11;
	int sum =0;

        while (num <= 90){
            sum=sum+num;
	    num++;
        }
	System.out.println(sum);
    }
}
