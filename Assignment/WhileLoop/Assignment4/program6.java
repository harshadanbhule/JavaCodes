/*Write a program to print the only consonant alphabets from A to Z, but there must
not be any vowels in the output.
Output: B C D F G H J K L M N P Q R S T V W X Y Z*/

class Demo {
    public static void main(String[] args) {
        char ch = 'A';

        while (ch <= 'Z') {

            if(ch != 'A'&& ch != 'E'&& ch != 'I' && ch != 'O' && ch != 'U'){
                System.out.println(ch);
            }

            ch++;
        }
    }
}
