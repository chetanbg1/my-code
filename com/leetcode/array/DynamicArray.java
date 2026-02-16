package com.leetcode.array;

public class DynamicArray {
    private int arr[];
    private int capacity;
    private int currentSize;
    private double loadFactor;
    private final static int DEFAULT = 10;
    private final static double DEFAULT_LOAD_FACTOR = 0.75;

    // Default constructor
    public DynamicArray() {
        this(DEFAULT, DEFAULT_LOAD_FACTOR);
    }

    // Constructor with capacity
    public DynamicArray(int cap) {
        this(cap, DEFAULT_LOAD_FACTOR);
    }

    // Constructor with capacity + load factor
    public DynamicArray(int cap, double loadFactor) {
        arr = new int[cap];
        capacity = cap;
        currentSize = 0;
        this.loadFactor = loadFactor;
    }

    public void add(int data) {
        if ((double) currentSize / capacity >= loadFactor) {
            resize(capacity * 2); // grow
        }
        arr[currentSize++] = data;
    }

    private void resize(int newCapacity) {
        int[] oldArr = arr;
        arr = new int[newCapacity];
        for (int i = 0; i < currentSize; i++) {
            arr[i] = oldArr[i];
        }
        capacity = newCapacity;
        System.out.println("Resized: New Capacity = " + capacity);
    }

    // ✅ Remove last element
    public int removeLast() {
        if (currentSize == 0) {
            throw new RuntimeException("Array is empty!");
        }
        int removed = arr[currentSize - 1];
        currentSize--;

        shrinkIfNeeded();
        return removed;
    }

    // ✅ Remove first element
    public int removeFirst() {
        if (currentSize == 0) {
            throw new RuntimeException("Array is empty!");
        }
        int removed = arr[0];
        for (int i = 1; i < currentSize; i++) {
            arr[i - 1] = arr[i];
        }
        currentSize--;

        shrinkIfNeeded();
        return removed;
    }

    // ✅ Remove element at index
    public int removeAt(int index) {
        if (index < 0 || index >= currentSize) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }
        int removed = arr[index];
        for (int i = index + 1; i < currentSize; i++) {
            arr[i - 1] = arr[i];
        }
        currentSize--;

        shrinkIfNeeded();
        return removed;
    }

    // Shrink array when usage < 25% of capacity
    private void shrinkIfNeeded() {
        if (currentSize > 0 && currentSize <= capacity / 4) {
            resize(capacity / 2);
        }
    }

    // Utility to print current elements
    public void print() {
        System.out.print("Elements: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return currentSize;
    }
}
