//return middle node


class Node{

	int data;
	Node next;

	Node(int data){
		this.data=data;
		this.next=null;
	}
	
}

class Linkedl{

	static int countNode(Node head){
		Node temp=head;

		int count=0;

		while(temp!=null){
			count++;

			temp=temp.next;
		}
		return count;
	}

	int answer(Node head){
		if(head==null){
			return -1;
		}

		int length=countNode(head);

		int midd=length/2;
		int count =0;
		Node temp=head;
		while(count<midd){
			count++;
			temp=temp.next;
		}

		return temp.data;
	}
	public static void main(String[] args){
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);

		Linkedl linkedl=new Linkedl();
		int data=linkedl.answer(head);
		System.out.println("Middle Node : "+data);
	}
}
