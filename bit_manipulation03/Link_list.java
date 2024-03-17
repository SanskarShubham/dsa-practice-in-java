class Link_list {
    /**
     * node
     */
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
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
        if (head ==null) {
            System.out.println("List is empty !");
        }

            Node currNode = head;

            while (currNode != null) {
                System.out.print(currNode.data +" -> ");
                currNode = currNode.next;
            }
            System.out.println("NULL");
        }

    public static void main(String[] args) {
        Link_list list = new Link_list();
        list.addFirst("am");
        list.addFirst("i");
        list.addLast("Shubham");
        list.printList();
    }
}
