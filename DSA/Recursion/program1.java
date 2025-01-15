//print 1 to 10 with recyrsion without using extra variable

class Demo{
	void numPrint(int num){
		if(num==0)
			return;
		numPrint(num-1);
		System.out.println(num);

	}
	public static void main(String[] args){
		Demo obj =new Demo();
		obj.numPrint(10);
	}

}

/*
 1
2
3
4
5
6
7
8
9
10*/
