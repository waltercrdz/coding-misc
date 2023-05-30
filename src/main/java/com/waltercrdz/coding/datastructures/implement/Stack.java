package com.waltercrdz.coding.datastructures.implement;

import java.util.Objects;

public class Stack<T> {
    private Node<T> head;

    public void push(T element) {
        Node<T> node = new Node<>(element, head);
        head = node;
    }

    public T pop() {
        if (this.isEmpty())
            return null;
        T data = head.getData();
        head = head.getNext();
        return data;
    }

    public T peek() {
        if (this.isEmpty())
            return null;
        return head.getData();
    }

    public boolean isEmpty() {
        return Objects.isNull(head);
    }

    public void print() {
        System.out.print("[ ");
        Node<T> current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("]");
    }

    public class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node<T> setData(T data) {
            this.data = data;
            return this;
        }

        public Node<T> getNext() {
            return next;
        }

        public Node<T> setNext(Node<T> next) {
            this.next = next;
            return this;
        }
    }

    public static void main(String[] args) {
        final Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        stack.print();
    }
}
