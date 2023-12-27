package com.example;
import  java.util.*;

public class LinkedList<T extends Comparable<T>> {
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

    public void inserInSorted(T key)
    {
        Node<T> newNode = new Node<>(key);
        if(head==null)
            head=newNode;
        
        else if(key.compareTo(head.data)<0)
        {
            newNode.next=head;
            head=newNode;
        }
        else 
        {
            Node<T> p=head,q=head.next;
            while(q!=null)
            {
                if(key.compareTo(q.data)<0)
                {
                    p.next=newNode;
                    newNode.next=q;
                    break;
                }
                p=p.next;
                q=q.next;
            }

            if(q==null)
                p.next=newNode;
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