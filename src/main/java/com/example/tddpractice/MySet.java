package com.example.tddpractice;

public class MySet {
    private Integer[] store = new Integer[20];
    private int currentIndex = 0;

    public boolean add(int element) {
        if (!contains(element)) {
            store[currentIndex] = element;
            ++currentIndex;
            return true;
        }
        return false;
    }

    public boolean contains(int element) {
        for (Integer i : store) {
            if (i != null && i == element) {
                return true;
            }
        }
        return false;
    }

    public int size(){
        int size = 0;
        for (Integer i : store) {
            if (i != null) {
                ++size;
            }
        }
        return size;
    }
}
