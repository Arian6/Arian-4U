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

        InventoryRecord b = new InventoryRecord("oak", "table", 1, 150, 'B', true);
        InventoryRecord a = new InventoryRecord("sdf", "sdfsdf", 4, 5, 'd', true);

        //System.out.println(a.toString());
        InventoryStore c = new InventoryStore();

        c.add(b);
        c.add(a);
        // System.out.println(b.getFurnitureId());
        // c.add(b);
        // System.out.println(b.getFurnitureId());
//        //c.close();
        
        c.get(1);
        c.get(2);

        c.remove(1);

        c.get(1);

//        InventoryStore c = new InventoryStore();
//        
//        c.open();
//        c.write(a);
//        
//        c.read();
    }

}
