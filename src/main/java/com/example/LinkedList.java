package com.example;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addData(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null)
            head = newNode;
        else {
            Node<T> tmp = head;
            while (tmp.next != null)
                tmp = tmp.next;
            tmp.next = newNode;
        }
    }

    public void deleteLast(){
        if(head == null || head.next==null)
            head=null;
        else 
        {
            Node<T> tmp=head;
            while(tmp.next.next!=null)
                tmp=tmp.next;
            tmp.next=null;
        }
    }

    public void display() {
        Node<T> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }

}