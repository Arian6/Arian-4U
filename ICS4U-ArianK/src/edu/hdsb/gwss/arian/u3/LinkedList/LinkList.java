/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.LinkedList;

/**
 *
 * @author 1krasniqiari
 */
public class LinkList implements LinkListInterface {

    protected Node head;
    private Node tail;

    public LinkList() {
        this.head = null;
    }

    @Override
    public int size() {

        Node a = this.head;
        int counter = 1;

        if (this.isEmpty()) {
            return 0;
        } else {
            while (a.getNext() != null) {

                a = a.getNext();
                counter++;
            }

            return counter;
        }
    }

    @Override
    public void makeEmpty() {
        Node empty = this.head;
        Node temp;

        if (!this.isEmpty()) {

            while (empty.getNext() != null) {

                temp = empty;

                empty = null;
                empty = temp.getNext();

            }
        }

    }

    @Override
    public boolean isEmpty() {

        if (this.head == null) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void addAtFront(String str) {
        Node front = new Node(str);

        if (this.isEmpty()) {
            this.tail = front;
        }

        front.setNext(this.head);
        this.head = front;

    }

    @Override
    public void addAtEnd(String str) {

        Node back = new Node(str);

        if (this.isEmpty()) {
            this.head = back;
        }
        back.setNext(this.tail);
        this.tail = back;

    }

    @Override
    public void remove(String str) {

        Node remove = this.head;
        Node temp;
        if (this.head.getData().equals(str)) {
            this.removeHead();
        } else if (this.tail.getData().equals(str)) {
            this.removeTail();
        } else {
            while (!remove.getNext().getData().equals(str)) {
                remove = remove.getNext();
            }
            temp = remove.getNext();
            remove.setNext(remove.getNext().getNext());
            temp = null;

        }

    }

    @Override
    public String removeHead() {
        Node first = this.head;
        Node keep;

        if (!this.isEmpty()) {
            if (this.head == this.tail) {
                this.head = null;
                this.tail = null;

            } else {

                keep = this.head;
                this.head = this.head.getNext();
                keep.setNext(null);

            }
            return first.getData();

        } else {
            return null;
        }
    }

    public String removeTail() {

        Node last = this.head;
        Node keep;
        
        if (!this.isEmpty()) {
            if (this.head == this.tail) {
                this.head = null;
                this.tail = null;
                return last.getData();
            } else {
                while (last.getNext() != this.tail) {
                    last = last.getNext();
                }
                keep = last.getNext();
                last.setNext(null);
                this.tail = last;

                return keep.getData();
            }

        } else {
            this.head = null;
            this.tail = null;
            return null;
        }
    }

    @Override
    public String head() {

        if(!this.isEmpty()) {
        return this.head.getData();
        }else 
        {
            return null;
        }

    }

    @Override
    public String tail() {
           if(!this.isEmpty()) {
        return this.tail.getData();
        }else 
        {
            return null;
        }
    }

}
