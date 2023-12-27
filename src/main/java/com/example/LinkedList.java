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

    public void display() {
        Node<T> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }

    public void insertAfterK(T key, T K)
    {
        Node<T> p=head;
        Node<T> t=new Node<T>(key);

        while (p!=null) {
            if(p.data==K)
            {
                t.next=p.next;
                p.next=t;
                break;
            }
            p=p.next;
        }

        if(p==null)
            System.out.println("element " + K +" is not found and hence we can't insert");
    }

}