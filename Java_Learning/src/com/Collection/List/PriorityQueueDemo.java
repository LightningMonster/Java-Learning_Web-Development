package com.Collection.List;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Charlie");
        queue.add("Alice");
        queue.add("Bob");

        System.out.println(queue);
    }
}

