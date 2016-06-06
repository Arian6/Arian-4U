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
    public InventoryStore() throws FileNotFoundException {
        this.open();
    }

    private void open() throws FileNotFoundException {
        this.ikeaF = new RandomAccessFile("ikea_info.txt", "rw");
    }

    private void close() throws IOException {
        ikeaF.close();
    }

    private InventoryRecord write(InventoryRecord f) throws IOException {

        if (f.getFurnitureId() == -1) {
            ikeaF.seek(ikeaF.length());
            f.setFurnitureId((int) (ikeaF.length() / InventoryRecord.RECORD_SIZE) + 1);
        } else {
            ikeaF.seek((f.getFurnitureId() - 1) * InventoryRecord.RECORD_SIZE);
        }

        //include in size
        ikeaF.writeChars(f.getName());
        //ikeaF.writeChar('|');
        ikeaF.writeChars(f.getTypeOfFurniture());
        //ikeaF.writeChar('|');
        ikeaF.writeBytes(Integer.toString(f.getMaterial()));
        //ikeaF.writeChar('|');
        ikeaF.writeBytes(Double.toString(f.getPrice()));
        //ikeaF.writeChar('|');
        ikeaF.writeBytes(Integer.toString(f.getDifficulty()));
        // ikeaF.writeChar('|');
        ikeaF.writeBytes(Boolean.toString(f.isInStock()));
        //  ikeaF.writeChar('|');

        return f;

    }

    public InventoryRecord update(InventoryRecord f) throws IOException {

        return write(f);

    }

    public InventoryRecord add(InventoryRecord f) throws IOException {
        return write(f);

    }

    public void read() throws IOException {

//        Scanner input = new Scanner(System.in);
//
//        long numRecords = (ikeaF.length() / InventoryRecord.RECORD_SIZE);
//        System.out.println("\nThere are " + numRecords + " records currently in the file.");
//
//        System.out.println("Which record do you want [1 - " + numRecords + "] or 0 to exit?");
//        long recordNumber = input.nextLong();
//
//        long position = InventoryRecord.RECORD_SIZE * (recordNumber - 1);
        ikeaF.seek(0);

        //String nameF = "";
        char name[] = new char[InventoryRecord.LENGTH_NAME];
        for (int i = 0; i < InventoryRecord.LENGTH_NAME; i++) {
            name[i] = ikeaF.readChar();
        }

        for (int i = 0; i < name.length - 1; i++) {
            System.out.print(name[i]);
        }

        char type[] = new char[InventoryRecord.LENGTH_NAME];
        for (int i = 0; i < InventoryRecord.LENGTH_NAME; i++) {

            type[i] = ikeaF.readChar();

        }

        for (int i = 0; i < type.length - 1; i++) {

            System.out.print(type[i]);
        }

        System.out.print(ikeaF.readChar());
        System.out.print(ikeaF.readDouble());
        //nameF = nameF + ikeaF.readChar();
        //System.out.println(nameF);
//
//        String typeF = "";
//        while (ikeaF.readChar() != '|') {
//            typeF = typeF + ikeaF.readChar();
//        }
//
//        System.out.println("Name: " + nameF + ", " + "Furniture Type: " + typeF + ", " + "Material: " + ikeaF.readInt() + ", " + "Price: " + ikeaF.readDouble() + ", " + "Difficulty: " + ikeaF.readChar() + "InStock?: " + ikeaF.readBoolean());
    }

    public void remove() {

    }

}
