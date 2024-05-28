/*
 6. Write a program where you have to take input from the user for a character array and
print the characters.*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size :");
		int size=sc.nextInt();

		char[] ch=new char[size];
		
		System.out.println("Enetr Characters : ");
		for(int i=0;i<size;i++){
			ch[i]=sc.next().charAt(0);
		}
		System.out.println("Output : ");

		for(int i=0;i<size;i++){
			System.out.print(ch[i]+",");
		}
	}
}


/*
Enter Size :
5
Enetr Characters :
a
d
f
g
t
Output :
a,d,f,g,t,*/
