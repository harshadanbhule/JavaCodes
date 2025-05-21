class Node{
        int data;
        Node next=null;
	Node prev=null;

        Node(int data){
                this.data=data;
        }
}

class DoublyLinkedList{
        Node head=null;

	void addFirst(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
		}else{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}

	void addLast(int data){
		Node newNode=new Node(data);

		if(head==null){
			head=newNode;
		}else{
			Node temp=head;

			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
		}
	}

	int countNode(){
		Node temp=head;
		int count=0;

		while(temp!=null){
			count++;
			temp=temp.next;
		}

		return count;
	}

	void addAtPos(int pos,int data){
		if(pos<=0 || pos>countNode()+2){
			System.out.println("Wrong input !");
			return;
		}else if(pos==1){
			addFirst(data);
		}else if(pos==countNode()+1){
			addLast(data);
		}else{
			Node newNode=new Node(data);
			Node temp=head;		

			while(pos-2!=0){
				temp=temp.next;
				pos--;
			}

			newNode.prev=temp;
			newNode.next=temp.next;
			temp.next=newNode;
			newNode.next.prev=newNode;
		}
	}
	void delFirst(){
		if(head==null){
			System.out.println("Linkedlist is empty");
		}else if(countNode()==1){
			head=null;
		}else{
			head=head.next;
			head.prev=null;
		}
	}

	void delLast(){
		if(head==null){
                        System.out.println("Linkedlist is empty");
                        return;
                }else if(countNode()==1){
                        head=null;
                }else{
			Node temp=head;

			while(temp.next!=null){
				temp=temp.next;
			}
			temp.prev.next=null;
			temp.prev=null;
			
		}
	}

	void printDLL(){
		if(head==null){
			System.out.println("LinkedList is Empty");
		}else{
			Node temp=head;

			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	
	}

	void delAtPos(int pos){
		  if(pos<=0 || pos>countNode()+1){
                        System.out.println("Wrong input !");
                        return;
                }else if(pos==1){
                        delFirst();
                }else if(pos==countNode()){
                        delLast();
                }else{
                        
                        Node temp=head;

                        while(pos-2!=0){
                                temp=temp.next;
                                pos--;
                        }

                       temp.next=temp.next.next;
		       temp.next.prev=temp;
                }
	}
}

class Client{

        public static void main(String[] args){
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.addFirst(10);
		dll.addFirst(20);
		dll.addFirst(30);
		dll.addLast(15);
		dll.addAtPos(1,25);
		dll.addAtPos(-3,25);
		dll.printDLL();
		System.out.println("delete First");
		dll.delFirst();
		dll.printDLL();
		System.out.println("delete Last");
                dll.delLast();
		dll.printDLL();
		System.out.println("delete At Position");
                dll.delAtPos(2);
                dll.printDLL();
        }
}

/*
Wrong input !
25
30
20
10
15
delete First
30
20
10
15
delete Last
30
20
10
delete At Position
30
10*/
