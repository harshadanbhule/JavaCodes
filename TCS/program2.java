//check vowel and consonant present in string 


import java.util.*;

class Demo{

        void answer(String input){
                char arr[]=input.toCharArray();
                int vowel=0;
		int consonant=0;
		int whiteSpace=0;
                for(int i=0;i<arr.length;i++){
                        char n=Character.toLowerCase(arr[i]);
                        if(n=='a' ||  n=='e'|| n=='i' ||  n=='o' ||  n=='u'){
                                vowel++;
                        }else if(Character.isLetter(n)){
				consonant++;
			}else if(Character.isWhitespace(n)){
				whiteSpace++;
			}
                }
		System.out.println("vowel : "+vowel+ " & consonant : "+consonant+" Space : "+whiteSpace);
               
        }
        public static void main(String[] args){
                Scanner sc =new Scanner(System.in);
                String input=sc.nextLine();

                Demo obj=new Demo();
                obj.answer(input);

        }
}
/*
 ajs ske lnsi o
vowel : 4 & consonant : 7 Space : 3*/
