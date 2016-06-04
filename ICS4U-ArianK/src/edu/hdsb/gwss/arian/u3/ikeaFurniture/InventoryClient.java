/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.ikeaFurniture;

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

        InventoryRecord b = new InventoryRecord("kkk", "arikkkan", 0, 0, 'a', true);

        InventoryStore c = new InventoryStore();

        c.open();
        c.write(b);
        //c.close();

         c.read();
//        InventoryStore c = new InventoryStore();
//        
//        c.open();
//        c.write(a);
//        
//        c.read();
    }

}
