class Node{
        int data;
        Node next=null;

        Node(int data){
                this.data=data;
        }
}

class LinkedList{
        Node head=null;

	void addFirst(int data){
		Node newNode=new Node(data);

		if(head==null){
			head=newNode;
		}else{
			newNode.next=head;
			head=newNode;
		}
	}

	void addLast(int data){
		Node newNode=new Node(data);
		if(head == null){
			head=newNode;
		}else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}

	int countNode(){
		Node temp=head;
		int count=0;

		while(temp !=null){

			count++;
			temp=temp.next;
		}
		return count;
	}

	void addAtPos(int pos,int data){
		if(pos<=0 || pos>= countNode()+2){
			System.out.println("Wrong input <F12><F12>!");
		}	
		
		if(pos==1){
			addFirst(data);
		}else if(pos==countNode()+1){
			addLast(data);
		}else{
			Node newNode=new Node(data);
			Node temp=head;
			while(pos-2 !=0){
				temp=temp.next;
				pos--;
			}
		}
		newNode.next=temp.next;
		temp.next=newNode;

	}

	void printSLL(){
		if(head==null){
			System.out.println("Empty LinkedList");
		}else{
			 Node temp=head;

			 while(temp!=null){
			 	System.out.println(temp.data +" ");
				temp =temp.next;
			 }
		}
	}
}

class Client{

        public static void main(String[] args){
		LinkedList ll=new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addLast(15);
		ll.addAtPos(1,25);
		ll.printSLL();
        }
}
