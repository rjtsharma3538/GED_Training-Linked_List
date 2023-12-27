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

    public void deleteKey(T key)
    {
        Node<T> p=head,q=head.next;
        if(p.data==key)
            p=p.next;
        else 
        {
            while(q!=null)
            {
                if(q.data==key)
                {
                    p.next=q.next;
                    q=p.next;
                    break;
                }
                else 
                {
                    p=p.next;
                    q=q.next;
                }
                
            }
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