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
    protected Node tail;

    public LinkList() {
        this.head = null;
    }

    @Override
    public int size() {

        Node a = this.head;
        int counter = 1;

        while (a.getNext() != null) {

            a = a.getNext();
            counter++;
        }

        return counter;
    }

    @Override
    public void makeEmpty() {
        Node empty = this.head;

        while (empty.getNext() != null) {

            empty = null;
            empty = empty.getNext();

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

        front.setNext(this.head);
        this.head = front;

        if (this.isEmpty()) {
            this.tail = front;
        }

    }

    @Override
    public void addAtEnd(String str) {

        Node back = new Node(str);

        back.setNext(this.tail);
        this.tail = back;

        if (this.isEmpty()) {
            this.head = back;
        }

    }

    @Override
    public void remove(String str) {

        if (this.head.getData().equals(str)) {
            temp = this.head.getNext();
            this.head = null;
            this.head = temp;

        } else if (this.tail.getData().equals(str)) {
            temp = this.head.getNext();
            this.head = null;
            this.head = temp;

        }

        while (empty.getNext() != null) {

        }

    }

    @Override
    public String removeHead() {
        Node first = this.head;
        Node keep;

        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
            return first.getData();
        } else {

            keep = this.head;
            this.head = first.getNext();
            keep.setNext(null);

            return this.head.getData();
        }
    }

    public String removeTail() {

        Node last = this.head;
        Node keep;

        if (this.head == this.tail) {
            last = null;
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
    }

    @Override
    public String head() {

        return this.head.getData();
    }

    @Override
    public String tail() {
        return this.tail.getData();
    }

}
