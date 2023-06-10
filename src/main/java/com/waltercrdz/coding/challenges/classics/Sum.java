package com.waltercrdz.coding.challenges.classics;

import com.personal.datastructures.my.implement.SimpleLinkedList;

public class Sum {
    public static void main(String[] args) {
        SimpleLinkedList<Integer> num1 = new SimpleLinkedList<>(), num2 = new SimpleLinkedList<>(), result;
        num1.add(5);
        num1.add(9);
        num1.add(9);
        num1.print();
        num2.add(2);
        num2.add(9);
        num2.add(5);
        num2.print();
        result = sum(num1, num2);
        result.print();
    }

    public static SimpleLinkedList<Integer> sum(SimpleLinkedList<Integer> num1, SimpleLinkedList<Integer> num2) {
        int carry = 0;
        SimpleLinkedList<Integer> result = new SimpleLinkedList<>();
        SimpleLinkedList<Integer>.Node<Integer> aux1 = num1.getHead(), aux2 = num2.getHead();
        while(aux1 != null || aux2 != null) {
            int sum = carry;
            if(aux1 != null) sum += aux1.getData();
            if(aux2 != null) sum += aux2.getData();
            if(sum > 10) {
                carry = 1;
                sum = sum % 10;
            } else carry = 0;
            result.add(sum);
            aux1 = aux1.getNext();
            aux2 = aux2.getNext();
        }
        return result;
    }
}
