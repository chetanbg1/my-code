package com.leetcode.linkListDataStructure;

public class LinkedListDemo {
    public static void main(String[] args) {
       LinkedList list = new LinkedList();

       list.addFirst(5);
       list.addFirst(10);
       list.addFirst(15);
       list.addLast(20);
       list.addAt(2,50);
       list.disPlay();
        System.out.println();
        System.out.println(list.getAt(3));

    }
}
