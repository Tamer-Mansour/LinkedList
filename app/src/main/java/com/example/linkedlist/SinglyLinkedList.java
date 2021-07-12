package com.example.linkedlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SinglyLinkedList extends AppCompatActivity {
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}