package ru.mirea.kabo0222.practices.practice23;

import org.w3c.dom.ls.LSOutput;

public class LinkedArrayQueue extends LinkedList{
    private final int SIZE = 5;
    private final LinkedList items = new LinkedList();
    LinkedArrayQueue() {
        super();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public void addElement(int data) {
        if (isFull()) System.out.println("Память переполнена");
        else super.addElement(data);
    }

    @Override
    public void deleteFirst() {
        super.deleteFirst();
    }

    @Override
    public void deleteLast() {
        super.deleteLast();
    }

    @Override
    public void deleteElement(Node student) {
        super.deleteElement(student);
    }

    @Override
    public void print() {
        super.print();
    }

    public boolean isFull() {
        return this.size == SIZE;
    }

    public static void main(String[] args) {
        LinkedArrayQueue object = new LinkedArrayQueue();
        object.addElement(1);
        object.addElement(1);
        object.addElement(1);
        object.addElement(1);
        object.addElement(1);
        object.addElement(2);
    }
}

