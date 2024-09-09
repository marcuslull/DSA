package utilities;

public class LinkedList {
    public Node head;

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void completeTheLoop(int data) {
        Node node = new Node(data);
        node.next = this.head;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }
}
