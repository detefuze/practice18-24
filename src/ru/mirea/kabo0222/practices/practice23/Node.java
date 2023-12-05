package ru.mirea.kabo0222.practices.practice23;
public class Node {
    Node next;
    Node prev;
    int data;

    public Node() {
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
