package com.intellekta.consumer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Consumers {
    List<Consumer>[] consumerListsArray;
    Set<Consumer> consumerList;

    public Consumers() {
    }

    public Consumers(List<Consumer>[] consumerListsArray) {
        this.consumerListsArray = consumerListsArray;
        consumerList = new HashSet<>();
    }

    public List<Consumer>[] getConsumerListsArray() {
        return consumerListsArray;
    }

    public void addConsumer(Consumer consumer) { //  принимает в качестве параметра объект Consumer и добавляет его в общий список контрагентов
        consumerList.add(consumer);
    }

    public List<Consumer> getConsumers() { // не принимает параметров, но возвращает List, содержащий только уникальных контрагентов
        for (List<Consumer> consumersList : getConsumerListsArray()) {
            for (Consumer consumer : consumersList) {
                consumersList.add(consumer);
            }
        }
        return List.copyOf(this.consumerList);
    }
}
