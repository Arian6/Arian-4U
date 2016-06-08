/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.closedHashTable;

/**
 *
 * @author 1krasniqiari
 */
public final class HashTable implements HashTableInterface {

    private final static int DEFAULT_CAPACITY = 11;

    private Student[] hashTable;

    public HashTable() {
        hashTable = new Student[DEFAULT_CAPACITY];
    }

    public HashTable(int capacity) {
        if (this.isPrime(capacity)) {
            hashTable = new Student[capacity];
        } else {
            hashTable = new Student[this.nextPrime(capacity)];
        }

    }

    public boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int nextPrime(int n) {

        if (!this.isPrime(n)) {
            return nextPrime(n + 1);
        } else {
            return n;
        }

    }

    @Override
    public int size() {
        int size = 0;

        for (int i = 0; i <= this.hashTable.length - 1; i++) {
            if (this.hashTable[i] != null) {
                size = size + 1;
            }
        }

        return size;
    }

    @Override
    public int capacity() {
        return this.hashTable.length;
    }

    @Override
    public double loadFactor() {

        return (this.size() / (double) this.capacity()) * 100;
    }

    @Override
    public void makeEmpty() {
        for (int i = 0; i < this.hashTable.length; i++) {
            this.hashTable[i] = null;
        }

    }

    @Override
    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void resize() {

        Student[] oldTable = new Student[this.capacity()];

        for (int i = 0; i <= this.hashTable.length - 1; i++) {
            oldTable[i] = this.hashTable[i];
        }

        this.hashTable = new Student[this.nextPrime(this.size() * 4)];

        this.makeEmpty();

        reHash(oldTable);

    }

    @Override
    public Student get(int key) {
        int index = this.hash(key);

        if (this.hashTable[index].getKey() == key) {
            return this.hashTable[index];

        } else {

            while (this.hashTable[index].getKey() != key) {
                index++;

                if (index == this.capacity()) {
                    index = index % this.capacity();
                }
            }

            return this.hashTable[index];
        }

    }

    @Override
    public Student remove(int key) {

        int index = this.hash(key);

        while (this.hashTable[index].getKey() != key) {
            index++;

            if (index == this.capacity()) {
                index = index % this.capacity();
            }
        }

        int savedKeyIndex = index;
        this.hashTable[index] = null;

        while (this.hashTable[index + 1] != null && this.hash(this.hashTable[index + 1].getKey()) == savedKeyIndex) {
            this.hashTable[index] = this.hashTable[index + 1];
            index = index + 1;
            if (index == this.capacity()) {
                index = index % this.capacity();
            }
        }
        return this.hashTable[savedKeyIndex];

    }

    @Override
    public void put(int key, Student value) {

        int hashIndex = this.hash(key);

        if (this.hashTable[hashIndex] == null) {
            this.hashTable[hashIndex] = value;
        } else {
            // if (!this.containsKey(key)) {
            while (this.hashTable[hashIndex] != null) {

                hashIndex = hashIndex + 1;

                if (hashIndex == this.capacity()) {
                    hashIndex = hashIndex % this.capacity();
                }

            }

            this.hashTable[hashIndex] = value;
            //  }
        }

        if (this.loadFactor() >= 75) {
            this.resize();
        }

    }

    @Override
    public boolean contains(Student value) {

        int index = this.hash(value.getKey());
        int savedKeyIndex = index;

        if (this.hashTable[index] == value) {
            return true;

        } else {
            while (this.hashTable[index] != null) {

                if (index == this.capacity()) {
                    index = index % this.capacity();
                }

                if (this.hashTable[index] == value) {
                    return true;

                } else {
                    index = index + 1;
                }

            }

            return false;
        }

    }

    @Override
    public boolean containsKey(int key) {

        int index = this.hash(key);

        while (this.hashTable[index] != null) {
            if (this.hashTable[index].getKey() == key) {
                return true;
            } else {
                index = index + 1;
                index = index % this.capacity();
            }
        }
        return false;
    }

    public void reHash(Student[] oldTable) {
        for (int i = 0; i <= oldTable.length - 1; i++) {

            if (oldTable[i] != null) {

                this.put(oldTable[i].getKey(), oldTable[i]);

            }

        }

    }

    public int hash(int key) {
        return key % this.capacity();

    }

}
