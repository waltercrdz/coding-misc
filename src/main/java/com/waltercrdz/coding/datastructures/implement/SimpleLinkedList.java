package com.waltercrdz.coding.datastructures.implement;

public class SimpleLinkedList<T> {
    private Node<T> head;
    private int size;

    public void add(T element) {
        head = new Node<>(element, head);
        size++;
    }

    public T remove() {
        if(this.isEmpty())
            return null;
        final T removedData = head.getData();
        head = head.getNext();
        size--;
        return removedData;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node<T> current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public Node<T> getHead() {
        return this.head;
    }

    public class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public Node<T> getNext() {
            return next;
        }

        @Override
        public String toString() {
            return data.toString();
        }

        public T getData() {
            return this.data;
        }
    }

    public static void main(String[] args) {
        final SimpleLinkedList<Integer> linkedList = new SimpleLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.print();

        final Integer data = linkedList.remove();
        System.out.println(data);
        linkedList.print();
    }
}
