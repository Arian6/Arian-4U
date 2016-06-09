package edu.hdsb.gwss.ics4u.pt;

/**
 * Linked List of Students
 *
 * @version v2016.S2
 */
public class LinkedListPT {

    private NodePT head;
    private NodePT tail;

    /**
     * Constructor: Empty Linked List
     */
    public LinkedListPT() {
        this.head = null;
        this.tail = null;
    }

    /**
     * @return returns the size (# of students) in the linked list.
     */
    public int size() {
        NodePT a = this.head;
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

    /**
     * This method makes the linked list empty.
     */
    public void makeEmpty() {
        this.head = null;
        this.tail = null;
    }

    /**
     * This method returns true if the linked list is empty
     *
     * @return returns true if there are no student objects in the linked list
     */
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method adds a student object to the end of the linked list.
     *
     *
     * @param student
     */
    public void addAtEnd(CSStudent student) {

        NodePT back = new NodePT(student);

        if (this.isEmpty()) {
            this.head = back;
            this.tail = back;

        } else {

            this.tail.setNext(back);
            this.tail = back;

        }
        
    
    }

    /**
     * This method will get a student object from the linked list, given the
     * student number
     *
     * @param key student number (key)
     * @return returns the student object for the given key, or null if it
     * doesn't exist.
     */
    public CSStudent get(int key) {
        NodePT get = this.head;
        NodePT temp;

        while (get.getNext().getData().getKey() != (key)) {
            get = get.getNext();
        }

        return get.getData();

    }

    /**
     * This method will remove a student object from the linked list, given the
     * student number.
     *
     * @param key student number (key)
     * @return returns the removed student object, or null if the key is not
     * found
     */
    public CSStudent remove(int key) {
        NodePT remove = this.head;
        NodePT temp;

        if (!this.isEmpty()) {
            if (this.head.getData().getKey() == (key)) {
                this.removeHead();
            } else if (this.tail.getData().getKey() == (key)) {
                this.removeTail();
            } else {
                while (remove.getNext().getData().getKey() != (key)) {
                    remove = remove.getNext();
                }
                temp = remove.getNext();
                remove.setNext(remove.getNext().getNext());
                temp = null;

            }
        }

        return remove.getData();
    }

    public CSStudent removeHead() {
        NodePT first = this.head;
        NodePT keep;

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

    public CSStudent removeTail() {

        NodePT last = this.head;
        NodePT keep;

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

    /**
     * DONE FOR YOU
     */
    @Override
    public String toString() {
        return "HEAD: " + toString(this.head);
    }

    /**
     * DONE FOR YOU
     */
    private String toString(NodePT n) {
        String s = "";
        if (n != null) {
            s = n.getData() + " --> " + this.toString(n.getNext());
        }
        return s;
    }

}
