package com.example.linkedlist;

public class ListTester {

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList(new Node(12,null));
        sll.add(new Node(3,null));
        sll.add(new Node(4,null));
        sll.add(new Node(10,null));
        sll.add(new Node(5,null));
        sll.add(new Node(15,null));
        sll.add(new Node(2,null));
        sll.remove();
        sll.printValues();
    }
}
