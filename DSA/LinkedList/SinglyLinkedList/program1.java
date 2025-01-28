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
		ll.printSLL();
        }
}
