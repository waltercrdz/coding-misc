package com.waltercrdz.coding.datastructures.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue interface with LinkedList as implementation
 */
public class QueueCustom {

    private final Queue<String> queue;

    public QueueCustom() {
        this.queue = new LinkedList<>();
    }

    public void push(String data) {
        this.queue.add(data);
    }

    public String pop() {
        return this.queue.remove();
    }

    public String peek() {
        return this.queue.peek();
    }

    public int size() {
        return this.queue.size();
    }
}
