/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.CulminatingTask;

import java.util.ArrayList;

/**
 *
 * @author ARIAN
 */
public class LockClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> newCombo = new ArrayList<Integer>();
        newCombo.add( 1 );
        newCombo.add( 3 );
        newCombo.add( 5 );
        
        
        
        Master m = new Master();
        Dubdly a = new Dubdly();
      
        Android b = new Android();
      
        MasterU c = new MasterU();
        
   
   System.out.println(c.getLockCombo());
   
   System.out.println(c.getLockCombo());
   
   c.setLockCombo(4, 8, 1, 8);
   
    System.out.println(c.getLockCombo());
   
   System.out.println(c.getLockCombo());
   
   a.lock();
   
   a.unlock(5, 4, 1);
   a.unlock(4, 5, 1);
   a.unlock(5, 4, 1);
   a.unlock(5, 4, 1);
   
        
        
//       System.out.println();
//       System.out.println(m.getLockCombo());
//       System.out.println(m.getLockCombo());
//       System.out.println();
//       System.out.println(a.getLockCombo());
//       System.out.println(a.getLockCombo());
//        System.out.println();
//        System.out.println(b.getLockCombo());
//       System.out.println(b.getLockCombo());
//         System.out.println();
//       System.out.println(c.getLockCombo());
//       System.out.println(c.getLockCombo());
//       
//       b.setLockCombo(3, 8, 6);
//       
//       System.out.println();
//        System.out.println(b.getLockCombo());
//       System.out.println(b.getLockCombo());
//       
//        System.out.println(c.getLockCombo());
//        System.out.println(c.getLockCombo());
//        c.setLockCombo(3, 8, 6, 9);
//         System.out.println(c.getLockCombo());
//        System.out.println(c.getLockCombo());
//   
//      
//      
//        
        System.out.println(m.getSerialNumber());
         System.out.println(a.getSerialNumber());
          System.out.println(b.getSerialNumber());
           System.out.println(c.getSerialNumber());
           
    }
    
}
