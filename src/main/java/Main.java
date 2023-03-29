package main.java;

import main.java.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(1);

        System.out.println("adding nodes in LinkedList: ");
        myList.append(4);
        myList.append(3);
        myList.printList();
        myList.getTail();

        System.out.println("removing nodes: ");
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

        System.out.println("After remove first: ");
        myList.removeFirst();
        myList.printList();
        myList.getTail();
        myList.getHead();
        myList.getLength();

        System.out.println("After remove first: ");
        myList.removeFirst();
        myList.printList();
        myList.getTail();
        myList.getHead();
        myList.getLength();

        System.out.println("After remove first on empty LinkedList: ");
        myList.removeFirst();
        myList.printList();
        myList.getTail();
        myList.getHead();
        myList.getLength();

        System.out.println("Adding nodes in LinkedList:");
        myList.append(4);
        myList.append(3);
        myList.printList();

        System.out.println("Node at index 1 is: " + myList.getAtIndex(1).value);
        System.out.println("Adding nodes in LinkedList:");

        myList.append(8);
        myList.append(1);
        myList.printList();

        System.out.println("Node at index 5 is: " + myList.getAtIndex(5));

        System.out.println("Printing LinkedList:");
        myList.printList();

        System.out.println("Printing LinkedList after setting value 2 at index 1: " + myList.setAtIndex(1, 2));
        myList.printList();

        System.out.println("Printing LinkedList after inserting value 7 at index 2: " + myList.insert(2, 7));
        myList.printList();

        System.out.println("Printing LinkedList after reversal: ");
        myList.reverse();
        myList.printList();
    }
}