package com.epam.collections.queue;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> pq  = new PriorityQueue<String>(Collections.reverseOrder());
        pq.addAll(firstList);
        pq.addAll(secondList);
        return pq;

    }
}
