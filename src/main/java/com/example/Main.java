package com.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to linked list problem");

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        
        
        integerLinkedList.addData(56);
        integerLinkedList.addData(30);
        integerLinkedList.addData(70);
        System.out.println("linked list before insertion");
        integerLinkedList.display();


        integerLinkedList.insertAfterK(40, 30);
        System.out.println("linked list after insertion");
        integerLinkedList.display();
    }
}