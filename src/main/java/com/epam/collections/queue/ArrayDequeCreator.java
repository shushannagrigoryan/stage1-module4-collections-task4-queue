package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrDeq = new ArrayDeque<>();
        arrDeq.add(firstQueue.remove());
        arrDeq.add(firstQueue.remove());

        arrDeq.add(secondQueue.remove());
        arrDeq.add(secondQueue.remove());

        while(!firstQueue.isEmpty() && !secondQueue.isEmpty()){
            firstQueue.add(arrDeq.pollFirst());
            arrDeq.add(firstQueue.remove());
            arrDeq.add(firstQueue.remove());

            secondQueue.add(arrDeq.pollFirst());
            arrDeq.add(secondQueue.remove());
            arrDeq.add(secondQueue.remove());

        }

        return arrDeq;
    }
}
