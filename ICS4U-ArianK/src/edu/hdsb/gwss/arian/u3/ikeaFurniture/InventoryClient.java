/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.ikeaFurniture;

import java.io.RandomAccessFile;

/**
 *
 * @author 1krasniqiari
 */


public class InventoryClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        System.out.println("Creating 4 Class Records");
        InventoryRecord a = new InventoryRecord("Mr. Sanderson", "Chemistry", 31);
        
        InventoryRecord b = new InventoryRecord("asdf", "asdf", 12, 34, 'D', true);
        
        System.out.println(b.getDifficultyDescription());

        
//        InventoryStore c = new InventoryStore();
//        
//        c.open();
//        c.write(a);
//        
//        c.read();
        
    }

}
