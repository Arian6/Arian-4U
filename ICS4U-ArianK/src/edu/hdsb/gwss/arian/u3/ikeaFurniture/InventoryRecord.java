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

    protected final static int RECORD_SIZE = 55;
    protected final static int LENGTH_NAME = 15;
    protected final static int LENGTH_TYPE = 15;
    protected final static int NOT_SET = -1;

    private static final String[] MATERIAL = {"unknown", "plastic", "metal", "rubber", "wood"};

    private static final String[] DIFFICULTY = {"super easy", "easy", "moderate", "hard", "very hard"};

    

    private String name;
    private String typeOfFurniture;
    protected int material;
    private int furnitureId = -1;
    private double price;
    private char difficulty;
    private boolean inStock;

    public InventoryRecord() {
        this.inStock = false;
        this.furnitureId = -1;
    }

    public InventoryRecord(String name, String typeOfFurniture, double price) {
        this.setName(name);
        this.setTypeOfFurniture(typeOfFurniture);
        this.setMaterial(0);
        this.setPrice(price);
        this.setDifficulty('A');
        this.furnitureId = -1;
        this.inStock = false;
    }

    public InventoryRecord(String name, String typeOfFurniture, int material, double price, char difficulty, boolean inStock) {
        this.setName(name);
        this.setFurnitureId(furnitureId);
        this.setTypeOfFurniture(typeOfFurniture);
        this.setMaterial(material);
        this.setPrice(price);
        this.setDifficulty(difficulty);
        this.setInStock(inStock);

    }

    public String getName() {

        return this.name;
    }

    protected void setName(String name) {
        StringBuilder temp = new StringBuilder();

        if (name != null) {
            temp.append(name.trim());
        } else {
            temp.append("TBD");
        }

        // trucates or pads the string
        temp.setLength(LENGTH_NAME);
        this.name = temp.toString();

    }
    


    public String getTypeOfFurniture() {
        return this.typeOfFurniture;
    }

    public void setTypeOfFurniture(String typeOfFurniture) {
        StringBuilder temp = new StringBuilder();

        if (typeOfFurniture != null) {
            temp.append(typeOfFurniture.trim());
        } else {
            temp.append("TBD");
        }

        temp.setLength(LENGTH_TYPE);
        this.typeOfFurniture = temp.toString();
        this.typeOfFurniture = typeOfFurniture;

    }

    public int getFurnitureId() {
        return this.furnitureId;
    }

    public void setFurnitureId(int furnitureId) {
        this.furnitureId = furnitureId;
    }

    public String getMaterialDescription() {
        return this.MATERIAL[material];
    }

    public int getMaterial() {
        return this.material;
    }

    public void setMaterial(int material) {
        if (material < 0 || material > 4) {
            this.material = 0;
        } else {
            this.material = material;
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < 0 || price > 2000) {
            this.price = -1;
        } else {
            this.price = price;
        }
    }

    public char getDifficulty() {
        return this.difficulty;
    }

    public String getDifficultyDescription() {
        return this.DIFFICULTY[this.difficulty - 'A'];
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
        return this.inStock;
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
        return "Inventory Item:" + "name=" + name + ", typeOfFurniture=" + typeOfFurniture + ", material=" + MATERIAL[material] + price + ", difficulty=" + this.getDifficultyDescription() + ", inStock=" + inStock + ", Furniture Id =" + this.furnitureId + '}';

    }

}
