package com.epam.collections.queue;

import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new LinkedList<>();
        List<Integer> newList = new LinkedList<>();
        for(int i = 1; i <=numberOfDishes; i++) {
            list.add(i);
        }

        int n = everyDishNumberToEat - 1;
        int index = 0;
        int len_list = list.size();
        while (len_list>0){
            index = (n+index)%len_list;
            newList.add(list.remove(index));
            len_list --;
        }
        return newList;
    }
}
