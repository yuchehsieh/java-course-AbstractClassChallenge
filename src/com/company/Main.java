package com.company;

public class Main {

    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "0 1 5 4 3 6 7 9 8 2";
        String[] data = stringData.split(" "); // return the string array
        for(String s: data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("2"));
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("7"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.removeItem(new Node("9"));
        tree.removeItem(new Node("1"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());

    }
}
