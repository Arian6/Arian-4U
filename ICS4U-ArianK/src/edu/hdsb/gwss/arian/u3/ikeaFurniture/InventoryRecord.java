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
public class InventoryRecord {

    protected final int RECORD_SIZE = 58;
    
    private static final String[] MATERIAL = {"unknown", "plastic", "metal", "rubber", "wood"};
    
    private static final int UNKNOWN = 0;
    private static final int PLASTIC = 1;
    private static final int METAL = 2;
    private static final int RUBBER = 3;
    private static final int WOOD = 4;
    
    private String name;
    private String typeOfFurniture;
    private int material;
    private int parts;
    private double price;
    private boolean inStock;

    public InventoryRecord() {
    }

    public InventoryRecord(String name, String typeOfFurniture, double price) {
        this.name = name;
        this.typeOfFurniture = typeOfFurniture;
        this.price = price;
    }
    
    

    
    
    
    
}
