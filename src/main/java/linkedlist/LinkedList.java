package main.java.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public class Node {
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null)
            System.out.println("Head: null");
        else
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
        } else if (length == 0) {
            return;
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
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
        length++;
    }

    public void removeFirst() {
        if (length == 0) return;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0)
            tail = null;
    }

    public Node getAtIndex(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean setAtIndex(int index, int value) {
        Node temp = getAtIndex(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;

        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        Node temp = getAtIndex(index - 1);
        if (temp != null) {
            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;
        }
        return false;
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= length) return;

        if (index == 0) {
            removeFirst();
        }
        if (index == length) {
            removeAtEndWithPreTemp();
        }

        Node prev = getAtIndex(index - 1);
        Node temp = prev.next;
        if (temp != null) {
            prev.next = temp.next;
            temp.next = null;
            length--;
        }
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}