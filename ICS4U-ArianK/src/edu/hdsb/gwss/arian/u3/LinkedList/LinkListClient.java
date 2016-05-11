/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.LinkedList;

/**
 *
 * @author ARIAN
 */
public class LinkListClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkList a = new LinkList();
        LinkList b = new LinkList();
        LinkList c = new LinkList();
        
        a.addAtFront("7");
        b.addAtFront("6");
        c.addAtFront("5");
        
        System.out.println(b.head);
        
        
    }
    
}
