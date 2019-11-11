package com.company;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "Taipei Murphy Frank May Jason Sam Murphy";
        String[] data = stringData.split(" "); // return the string array
        for(String s: data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());

    }
}
