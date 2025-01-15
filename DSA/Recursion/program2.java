//print 10 to 1 with recyrsion without using extra variable

class Demo{
        void numPrint(int num){
                if(num==0)
                        return;
                System.out.println(num);
		numPrint(--num);

        }
        public static void main(String[] args){
                Demo obj =new Demo();
                obj.numPrint(10);
        }

}

/*
10
9
8
7
6
5
4
3
2
1*/
