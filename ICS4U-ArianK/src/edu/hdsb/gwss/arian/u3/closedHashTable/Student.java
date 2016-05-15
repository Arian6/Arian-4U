package edu.hdsb.gwss.arian.u3.closedHashTable;

/**
 * Simple Student Object
 */
public class Student {

    private long studentID;
    private String name;
    private String lastName;

    public Student(long studentID, String name, String lastName) {
        this.studentID = studentID;
        this.name = name;
        this.lastName = lastName;
    }

    // TO DO
    public long getKey() {
        return this.studentID;
    }

    public long getStudentID() {
        return this.studentID;
    }

    public void setStudentID(long studentID) {

        if (studentID > 0 && studentID < 99999999) {
            this.studentID = studentID;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 2 && name.length() < 15) {
            this.name = name;
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        if (lastName.length() > 2 && lastName.length() < 15) {
            this.lastName = lastName;
        }

    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", name=" + name + ", lastName=" + lastName + '}';
    }

}
