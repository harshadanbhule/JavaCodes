class Node {
    int data;
    Node next = null;
    Node prev = null;

    Node(int data) {
        this.data = data;
    }
}

class DoublyCircularLinkedList {
    Node head = null;

    void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;

            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
    }

    void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;

            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    int countNode() {
        if (head == null)
            return 0;

        int count = 1;
        Node temp = head.next;

        while (temp != head) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    void addAtPos(int pos, int data) {
        int count = countNode();
        if (pos <= 0 || pos > count + 1) {
            System.out.println("Wrong input !");
            return;
        }

        if (pos == 1) {
            addFirst(data);
        } else if (pos == count + 1) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;

            while (pos - 2 != 0) {
                temp = temp.next;
                pos--;
            }

            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    void delFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        if (head.next == head) {
            head = null;
        } else {
            Node tail = head.prev;
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    void delLast() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        if (head.next == head) {
            head = null;
        } else {
            Node tail = head.prev;
            Node newTail = tail.prev;
            newTail.next = head;
            head.prev = newTail;
        }
    }

    void delAtPos(int pos) {
        int count = countNode();
        if (pos <= 0 || pos > count) {
            System.out.println("Wrong input !");
            return;
        }

        if (pos == 1) {
            delFirst();
        } else if (pos == count) {
            delLast();
        } else {
            Node temp = head;

            while (pos - 2 != 0) {
                temp = temp.next;
                pos--;
            }

            Node toDelete = temp.next;
            temp.next = toDelete.next;
            toDelete.next.prev = temp;
        }
    }

    void printDLL() {
    if (head == null) {
        System.out.println("LinkedList is Empty");
        return;
    }

    Node temp = head;
    while (temp.next != head) {
        System.out.println(temp.data + " ");
        temp = temp.next;
    }
    System.out.println(temp.data); 
}

}

class Client {
    public static void main(String[] args) {
        DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();
        dcll.addFirst(10);
        dcll.addFirst(20);
        dcll.addFirst(30);
        dcll.addLast(15);
        dcll.addAtPos(1, 25);
        dcll.addAtPos(-3, 25); // Invalid input
        dcll.printDLL();

        System.out.println("Delete First");
        dcll.delFirst();
        dcll.printDLL();

        System.out.println("Delete Last");
        dcll.delLast();
        dcll.printDLL();

        System.out.println("Delete At Position");
        dcll.delAtPos(2);
        dcll.printDLL();
    }
}

