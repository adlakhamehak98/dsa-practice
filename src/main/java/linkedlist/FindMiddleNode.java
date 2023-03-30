package main.java.linkedlist;

public class FindMiddleNode {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public FindMiddleNode(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node findMiddleNode() {
        Node temp1 = head;
        Node temp2 = head;

        while (temp2 != null && temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }

        return temp1;

    }

}

