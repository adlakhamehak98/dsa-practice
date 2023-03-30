package main.java.linkedlist;

public class HasLoop {

    private Node head;
    private Node tail;
    private int length;

    public class Node {
        int value;
        public Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public HasLoop(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }


    //will fail in case of negative node values
    public boolean hasLoop() {
        Node temp = head;
        if (head == null) return false;

        while (temp.next != null && temp.value != -1) {
            temp.value = -1;
            temp = temp.next;

            if (temp.next != null && temp.next.value == -1) {
                return true;
            }
        }
        return false;
    }

    //always successful
    public boolean hasLoop2() {
        Node currNode = head;
        Node nextNode = head;

        while(nextNode != null && nextNode.next != null) {
            currNode = currNode.next;
            nextNode = nextNode.next.next;

            if(currNode == nextNode)
                return true;
        }
        return false;
    }

}

