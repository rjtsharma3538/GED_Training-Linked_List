package com.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to linked list problem");

        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        integerLinkedList.addData(70);
        integerLinkedList.addData(30);
        integerLinkedList.addData(56);

        integerLinkedList.display();
    }
}