package main.java.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else
            System.out.println("Head: " + head.value);
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail: null");
        } else
            System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
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

    //one temp node approach
    public void removeAtEndWithTemp() {
        if (length == 1) {
            head = null;
            tail = null;
        } else if (length == 2) {
            tail = head;
            tail.next = null;
        } else if (length != 0) {
            for (int i = 1; i < length; i++) {
                Node tempNode = head;
                tail = tempNode.next;
                tail.next = null;
            }
        }
        length--;
    }

    //two temp node approach
    public void removeAtEndWithPreTemp() {
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            Node pre = head;

            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }

            tail = pre;
            tail.next = null;

        }
        length--;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp  = head;
            head = newNode;
            head.next = temp;
        }
        length++;
    }
}
