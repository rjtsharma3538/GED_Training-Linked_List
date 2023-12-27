package com.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to linked list problem");

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        
        integerLinkedList.addData(56);
        integerLinkedList.addData(30);
        integerLinkedList.addData(40);
        integerLinkedList.addData(70);

        System.out.println("Linked list before deletion");
        integerLinkedList.display();

        integerLinkedList.deleteKey(40);
        System.out.println("Linked list after deletion");
        integerLinkedList.display();
    }
}