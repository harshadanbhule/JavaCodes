//first double occurance char with 0(n) notation




public class FirstRepeatingCharacter {

    public static int firstRepChar(String s)
    {

        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int index = ch - 'a';


            if (charCount[index] != 0) {
                return index;
            }


            charCount[index]++;
        }

        return -1;
    }

    public static void main(String[] args)
    {

        String s = "hello";
        int result=firstRepChar(s);

        System.out.println((char)(result+65));
    }
}

