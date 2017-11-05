package linkedlists;

public class Node {
    int data;
    Node next;

    Node insert(Node head, int x) {
        Node node = new Node();
        node.data = x;
        node.next = null;
        if (head == null) {
            return node;
        } else {
            node.next = head;
        }
        return node;
    }
}

