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

    protected final static int RECORD_SIZE = 78;
    protected final static int LENGTH_NAME = 15;
    protected final static int LENGTH_TYPE = 15;
    protected final static int NOT_SET = -1;
    
    

    private static final String[] MATERIAL = {"unknown", "plastic", "metal", "rubber", "wood"};

    private static final String[] DIFFICULTY = {"super easy", "easy", "moderate", "hard", "very hard"};

    private String name;
    private String typeOfFurniture;
    private int material;
    private int furnitureId = -1;
    private double price;
    private char difficulty;
    private boolean inStock;
    
    public InventoryRecord() {
    }

    public InventoryRecord(String name, String typeOfFurniture, double price) {
        this.name = name;
        this.typeOfFurniture = typeOfFurniture;
        this.price = price;
        this.furnitureId = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        StringBuilder temp = new StringBuilder();

        if (this.name != null) {
            temp.append(this.name.trim());
        } else {
            temp.append("TBD");
        }

        // trucates or pads the string
        temp.setLength(LENGTH_NAME);
        this.name = temp.toString();

    }

    public String getTypeOfFurniture() {
        return typeOfFurniture;
    }

    public void setTypeOfFurniture(String typeOfFurniture) {
        StringBuilder temp = new StringBuilder();

        if (this.typeOfFurniture != null) {
            temp.append(this.typeOfFurniture.trim());
        } else {
            temp.append("TBD");
        }

        temp.setLength(LENGTH_TYPE);
        this.typeOfFurniture = temp.toString();
        this.typeOfFurniture = typeOfFurniture;

    }

    public int getFurnitureId() {
        return furnitureId;
    }

    public void setFurnitureId(int furnitureId) {
        this.furnitureId = furnitureId;
    }

    
    
    public String getMaterial() {
        return MATERIAL[material];
    }

    public void setMaterial(int material) {
        if (material < 0 || material > 4) {
            this.material = 0;
        } else {
            this.material = material;
        }
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0 || price > 2000) {
            this.price = -1;
        } else {
            this.price = price;
        }
    }

    public char getDifficulty() {
        return difficulty;
    }

    public String getDifficultyDescription() {
        return DIFFICULTY[this.difficulty - 'A'];
    }

    public void setDifficulty(char difficulty) {
        String s = new String(difficulty + "");
        s = s.toUpperCase();
        difficulty = s.charAt(0);

        if (difficulty >= 'A' && difficulty <= 'E') {
            this.difficulty = difficulty;
        } else {
            this.difficulty = '0';
        }
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        if (this.inStock == false) {
            this.inStock = false;
        } else {
            this.inStock = inStock;
        }

    }

    @Override
    public String toString() {
        return "Inventory Item:" + "name=" + name + ", typeOfFurniture=" + typeOfFurniture + ", material=" + MATERIAL[material] +  price + ", difficulty=" + this.getDifficultyDescription() + ", inStock=" + inStock + ", Furniture Id =" + this.furnitureId + '}';
        
        
    }
    
    

}
