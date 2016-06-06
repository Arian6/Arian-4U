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

        InventoryRecord b = new InventoryRecord("oak", "table", 3, 150, 'A', true);

        InventoryStore c = new InventoryStore();

        c.add(b);

        //c.close();
        c.get(1);
//        InventoryStore c = new InventoryStore();
//        
//        c.open();
//        c.write(a);
//        
//        c.read();
    }

}
