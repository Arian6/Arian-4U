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
        for (int i = 0; i < this.hashTable.length - 1; i++) {
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
          

        for (int i = 0; i <= oldTable.length - 1; i++) {

            if (oldTable[i] != null) {

                this.put(oldTable[i].getKey(), oldTable[i]);

            }

        }
        
          

    }

    @Override
    public Student get(int key) {
        int index = this.hash(key);

        if (this.hashTable[index].getKey() == key) {
            return this.hashTable[index];

        } else {

        }

        //check if right student
        //get hash 
        return this.hashTable[this.hash(key)];
    }

    @Override
    public Student remove(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void put(int key, Student value) {

        int hashIndex = this.hash(key);

        if (this.hashTable[hashIndex] == null) {
            this.hashTable[hashIndex] = value;
        } else {

            while (this.hashTable[hashIndex] != null) {

                hashIndex++;

                if (hashIndex == this.capacity()) {
                    hashIndex = hashIndex % this.capacity();
                }

            }
            this.hashTable[hashIndex] = value;
        }
        
        if (this.loadFactor() >= 75) {
            this.resize();
        }
        
    }

    @Override
    public boolean contains(Student value) {

        return true;
    }

    @Override
    public boolean containsKey(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hash(int key) {
        return key % this.capacity();

    }

}
