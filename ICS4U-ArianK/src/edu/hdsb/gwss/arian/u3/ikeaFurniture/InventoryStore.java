/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.ikeaFurniture;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author 1krasniqiari
 */
public class InventoryStore {

    private RandomAccessFile ikeaF;

    //open, close write, read, add, update, remove
    public void open() throws FileNotFoundException {
        this.ikeaF = new RandomAccessFile("ikea_info.dat", "rw");
    }

    public void close() throws IOException {
        ikeaF.close();
    }

    public InventoryRecord write(InventoryRecord f) throws IOException {

        if (f.getFurnitureId() == -1) {
            ikeaF.seek(ikeaF.length());
            f.setFurnitureId((int) (ikeaF.length() / InventoryRecord.RECORD_SIZE) + 1);
        } else {
            ikeaF.seek((f.getFurnitureId() - 1) * InventoryRecord.RECORD_SIZE);
        }

        ikeaF.writeChars(f.getName());
        ikeaF.writeChars(f.getTypeOfFurniture());
        ikeaF.writeInt(f.getMaterial());
        ikeaF.writeDouble(f.getPrice());
        ikeaF.writeChars(Integer.toString(f.getDifficulty()));
        ikeaF.writeChars(Boolean.toString(f.isInStock()));

        return f;

    }

    public InventoryRecord update(InventoryRecord f) throws IOException {

        return write(f);

    }

    public InventoryRecord add(InventoryRecord f) throws IOException {
        return write(f);

    }

    public void read() throws IOException {

        Scanner input = new Scanner(System.in);

        long numRecords = ikeaF.length() / InventoryRecord.RECORD_SIZE;
        System.out.println("\nThere are " + numRecords + " records currently in the file.");

        System.out.println("Which record do you want [1 - " + numRecords + "] or 0 to exit?");
        long recordNumber = input.nextLong();

        long position = InventoryRecord.RECORD_SIZE * (recordNumber - 1);

        ikeaF.seek(position);

        String nameF = "";
        for (int i = 0; i < InventoryRecord.LENGTH_NAME; i++) {
            nameF = nameF + ikeaF.readChar();
        }

        String typeF = "";
        for (int i = 0; i < InventoryRecord.LENGTH_TYPE; i++) {
            typeF = typeF + ikeaF.readChar();
        }

      //  System.out.println(InventoryRecord.);
        //System.out.println("Name: " + nameF + ", " + "Furniture Type: " + typeF + ", " + "Material: " + ikeaF.+ ", " + "Price: " + ikeaF.readDouble() + ", " + "Difficulty: " + ikeaF.readChar() + "InStock?: " + ikeaF.readBoolean());

    }

}
