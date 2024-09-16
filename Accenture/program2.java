/*
  Accenture Coding Questions asked in Technical
+coding Round .

Problem Statement:

Given a string and a specific character, you need to
count how many times that character appears in the
string.

Example:

Input:

String: "hello world"
Character to count: 'l'

Output:

The character 'l' appears 3 times in the string "hello
world".

Test Case 1:
Input:
● String: "banana"
● Character to count: 'a'
Expected Output:
● The character 'a' appears 3 times.*/


import java.util.*;

class Demo{

	public static int answer(String str,char ch){
		char arr[]=str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(ch==arr[i]){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=sc.nextLine();

		System.out.println("Enter Character : ");
		char  ch=sc.next().charAt(0);

		int result=answer(str,ch);
		System.out.println(result);
	}
}
