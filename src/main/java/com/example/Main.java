package com.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to linked list problem");

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        
        integerLinkedList.inserInSorted(56);
        integerLinkedList.inserInSorted(30);
        integerLinkedList.inserInSorted(70);
        integerLinkedList.inserInSorted(3);
        integerLinkedList.inserInSorted(45);
        integerLinkedList.inserInSorted(7);

        integerLinkedList.display();
    }
}