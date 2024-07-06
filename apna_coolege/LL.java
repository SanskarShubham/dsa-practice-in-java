package apna_coolege;

public class LL {
    Node head;
    class Node {
        Node next;
        int data;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
           System.out.println("List is empty !");
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty !");
            return;
        }
        head = head.next;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(5);
        list.printList();
    }
}
