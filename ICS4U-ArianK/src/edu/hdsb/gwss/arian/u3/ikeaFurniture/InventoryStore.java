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
        this.ikeaF = new RandomAccessFile("ikea_info.dat", "rw");
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

    public void get(int record) throws IOException {

        this.read(record);

    }

    private void read(int record) throws IOException {

        long position = InventoryRecord.RECORD_SIZE * (record - 1);
        ikeaF.seek(position);

        InventoryRecord a = new InventoryRecord();

        char name[] = new char[InventoryRecord.LENGTH_NAME];
        for (int i = 0; i < InventoryRecord.LENGTH_NAME; i++) {
            name[i] = ikeaF.readChar();
        }
        a.setName(new String(name));

        char type[] = new char[InventoryRecord.LENGTH_TYPE];

        for (int i = 0; i < InventoryRecord.LENGTH_TYPE; i++) {

            type[i] = ikeaF.readChar();
        }
        a.setTypeOfFurniture(new String(type));

        System.out.println(ikeaF.readInt());
        a.setMaterial(ikeaF.readInt());
        a.setPrice(ikeaF.readDouble());
        a.setDifficulty(ikeaF.readChar());
        a.setInStock(ikeaF.readBoolean());

        System.out.println(a.toString());
    }

    public void remove() {

    }

}
