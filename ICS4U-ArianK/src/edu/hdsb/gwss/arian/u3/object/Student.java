/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.object;

/**
 *
 * @author 1krasniqiari
 */
public class Student {

    //class constant
    private static final String SCHOOL_NAME = "GWSS";

    //class variable
    private static int lastIdUsed = 0;

    //object 
    private String firstName;
    private String lastName;
    private int oen;
    private String age;

    public Student() {
        this.setOen(++lastIdUsed);
        this.oen = lastIdUsed;
    }

    public static int getLastIdUsed() {
        return lastIdUsed;
    }

    public static void setLastIdUsed(int lastIdUsed) {
        Student.lastIdUsed = lastIdUsed;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getOen() {
        return oen;
    }

    public void setOen(int oen) {
        this.oen = oen;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.oen != other.oen) {
            return false;
        }
        if (this.oen == 0 || this.oen == 0) {
            return false;
        }

        return true;
    }

}
