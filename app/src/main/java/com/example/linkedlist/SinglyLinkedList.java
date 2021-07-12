package com.example.linkedlist;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    public void add(Node newNode) {
        newNode.next = head;
        head = newNode;

        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        head = head.next;
    }

    public void printValues() {
        Node n = head;
        while (n != null) {
            System.out.println(n.value);
            n = n.next;
        }
    }
}
