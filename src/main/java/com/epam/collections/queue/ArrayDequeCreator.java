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
            firstQueue.add(arrDeq.removeLast());
            arrDeq.addLast(firstQueue.remove());
            arrDeq.addLast(firstQueue.remove());

            secondQueue.add(arrDeq.removeLast());
            arrDeq.addLast(secondQueue.remove());
            arrDeq.addLast(secondQueue.remove());

        }

        return arrDeq;
    }
}
