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
public class Triangle {
    //object variables
    //or instance variables

    private int sideLengthA;
    private int sideLengthB;
    private int sideLengthC;

    //EMPTY constructor
    //"special method"
    // it is called once, only ONCE!
    // when a new object is created
    // no return method
    //no static
    public Triangle() {

        System.out.println("triangle created");
        System.out.println(sideLengthA);
        System.out.println(sideLengthB);
        System.out.println(sideLengthC);
    }

    public Triangle(int sideLengthA, int sideLengthB, int sideLengthC) {
        this.setSideLengthA( sideLengthA);
        this.sideLengthB = sideLengthB;
        this.sideLengthC = sideLengthC;
        //changed
        sideLengthA = sideLengthA * 10;
        System.out.println("triangle created");
        
        //this. refers to the parameter and wont be changed
        System.out.println(this.sideLengthA);
        System.out.println(this.sideLengthB);
        System.out.println(this.sideLengthC);
    }

    public int getSideLengthA() {
        return sideLengthA;
    }

    public void setSideLengthA(int sideLengthA) {
        if (sideLengthA <= 0) {
            //???????????????
         System.out.println("Invalid side length");
         
        } else {
        this.sideLengthA = sideLengthA;
        }
    }

    public int getSideLengthB() {
        return sideLengthB;
    }

    public void setSideLengthB(int sideLengthB) {
        this.sideLengthB = sideLengthB;
    }

    public int getSideLengthC() {
        return sideLengthC;
    }

    public void setSideLengthC(int sideLengthC) {
        this.sideLengthC = sideLengthC;
    }

    @Override
    public String toString() {
        return "Triangle{" + "sideLengthA=" + sideLengthA + ", sideLengthB=" + sideLengthB + ", sideLengthC=" + sideLengthC + '}';
    }
    
    

}
