package com.example.util;


import java.util.Iterator;

/**
 * author: Nag
 */


// data-structute must generic ( i.e shuld help work any type of data )
// data-structute must be iterable
// data-structure + iterator ( has iteration logic ) => Iterable

public class LinkedList<E> implements Iterable<E> {

    private class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    public void add(E n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public E get(int index) {
        Node temp = head;
        if (index == 0)
            return head.getData();
        else {
            int i = 1;
            temp = temp.getNext();
            while (temp != null) {
                temp = temp.getNext();
                i++;
                if (i == index) break;
            }
            return temp.getData();
        }
    }

    @Override
    public Iterator<E> iterator() {
        class It implements Iterator<E> {
            Node temp = head;

            @Override
            public boolean hasNext() {
                if (temp != null)
                    return true;
                else
                    return false;
            }

            @Override
            public E next() {
                E e = (E) temp.getData();
                temp = temp.getNext();
                return e;
            }
        }
        It it = new It();
        return it;
    }
}
