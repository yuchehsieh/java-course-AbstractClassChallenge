package com.company;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "0 1 5 4 3 6 7 9 8 2";
        String[] data = stringData.split(" "); // return the string array
        for(String s: data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("0"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("2"));
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("7"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("8"));
        list.removeItem(new Node("9"));
        list.removeItem(new Node("1"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("6"));
        list.traverse(list.getRoot());

    }
}
