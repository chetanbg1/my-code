package com.leetcode.linkListDataStructure;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void addAt(int idx, int data) {
        if (idx < 0 || idx > size) {
            throw new RuntimeException("indexs out of bound");
        }
        if (idx == 0) {
            addFirst(data);
        } else if (idx == size) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node privious = head;
            int count = 0;
            while (count <=idx - 1) {
                privious = privious.next;
                count++;
            }
            Node curr = privious.next;
            privious.next = newNode;
            newNode.next = curr;
            size++;
        }
    }

    public void disPlay() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -->");
            curr = curr.next;
        }
    }

    public int getFirst(){
        if(size ==0){
            return -1;
        }
        return head.data;
    }
    public int getLast(){
        if(size ==0){
            return -1;
        }
        return tail.data;
    }

    public int getAt(int n){
        if(size ==0){
            return -1;
        }
        else{
            Node temp = head;
            for(int jump = 0 ; jump < n-1;jump++){
                temp=  temp.next;
            }
            return temp.next.data;
        }

    }
}
