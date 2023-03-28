package main.java;

import main.java.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(1);
        myList.append(4);
        myList.append(3);
        myList.printList();
        myList.getTail();

        myList.removeAtEndWithPreTemp();
        myList.printList();
        myList.getTail();
        myList.getLength();

        myList.removeAtEndWithPreTemp();
        myList.printList();
        myList.getTail();
        myList.getLength();

        myList.removeAtEndWithTemp();
        myList.printList();
        myList.getTail();
        myList.getLength();

        System.out.println("After prepend 6: ");
        myList.prepend(6);
        myList.printList();
        myList.getTail();
        myList.getHead();
        myList.getLength();

        System.out.println("After prepend 5: ");
        myList.prepend(5);
        myList.printList();
        myList.getTail();
        myList.getHead();
        myList.getLength();
    }
}