package com.example.tddpractice;

public class MySet {
    private Integer[] store = new Integer[20];
    private int currentIndex = -1;

    public boolean add(int element) {
        if (!contains(element)) {
            store[++currentIndex] = element;
            return true;
        }
        return false;
    }

    public boolean contains(int element) {
        for (int i = 0; i <= currentIndex; i++) {
            if (store[i] == element) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return currentIndex + 1;
    }

    public boolean remove(int element) {
        for (int i = 0; i <= currentIndex; i++) {
            if (store[i] == element) {
                store[i] = store[currentIndex];
                store[currentIndex] = null;
                --currentIndex;
                return true;
            }
        }
        return true;
    }
}
