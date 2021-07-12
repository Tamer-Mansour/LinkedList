package com.example.linkedlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etPrint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrint = findViewById(R.id.etPrint);

        SinglyLinkedList sll = new SinglyLinkedList(new Node(12,null));
        sll.add(new Node(3,null));
        sll.add(new Node(4,null));
        sll.add(new Node(10,null));
        sll.add(new Node(5,null));
        sll.add(new Node(15,null));
        sll.add(new Node(2,null));
        sll.remove();
        sll.printValues();

        etPrint.setText(""+sll);
    }
}