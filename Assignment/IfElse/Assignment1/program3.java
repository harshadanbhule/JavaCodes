/*Write a program to check whether the given Character is in UPPERCASE (Capital) or
in lowercase. (take hardcoded values)
Input: ch = ‘a’;
Output: a is a lowercase character
Input: ch = ‘A’;
Output: A is an UPPERCASE character*/

class Demo{
        public static void main(String[] args){
        char letter='A';


        if(letter >= 65 && letter <= 90){
                System.out.println(letter + " is a UPPERCASE character");
        }else if(letter >= 97 && letter <= 122){

                System.out.println(letter + " is a lowercase character");
        }else{
		System.out.println(letter + " is not alphbate character");
	}

        }

}
