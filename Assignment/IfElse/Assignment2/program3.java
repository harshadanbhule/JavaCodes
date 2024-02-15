/*3.Write a program to check whether the given character is a vowel or consonant.(take hard
coded values)
Input 1: ‘a’
Output: a is vowel
Input 2: ‘D’
Output: D is consonant*/


class Demo{
        public static void main(String[] args){
                String ch = "a";

                switch (ch) {
            		case "a":
				System.out.println(ch + " is vowel");
                                break;
            		case "e":
				System.out.println(ch + " is vowel");
                                break;
            		case "i":
				System.out.println(ch + " is vowel");
                                break;
            		case "o":
				System.out.println(ch + " is vowel");
                                break;
            		case "u":
                		System.out.println(ch + " is vowel");
                		break;
            		default:
                		System.out.println(ch + " is consonant");
        }
	
        }
}
