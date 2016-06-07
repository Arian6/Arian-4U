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
        ikeaF.writeInt(f.getMaterial());
        //ikeaF.writeChar('|');
        ikeaF.writeDouble(f.getPrice());
        //ikeaF.writeChar('|');
        ikeaF.writeInt(f.getDifficulty());
        // ikeaF.writeChar('|');
        ikeaF.writeBoolean(f.isInStock());
        //  ikeaF.writeChar('|');

        return f;

    }

    public InventoryRecord update(InventoryRecord f) throws IOException {

        return write(f);

    }

    public InventoryRecord add(InventoryRecord f) throws IOException {
        return write(f);

    }

    public InventoryRecord get(int record) throws IOException {

        return read(record);

    }

    private InventoryRecord read(int record) throws IOException {
        InventoryRecord a = new InventoryRecord();
        long position = InventoryRecord.RECORD_SIZE * (record - 1);
        ikeaF.seek(position);

//        while (ikeaF.readBoolean() == true) {
//            record++;
//            position = InventoryRecord.RECORD_SIZE * (record - 1);
//            ikeaF.seek(position);
//        }
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

        a.setMaterial(ikeaF.readInt());
        a.setPrice(ikeaF.readDouble());
        ikeaF.readChar();
        a.setDifficulty(ikeaF.readChar());
        a.setInStock(ikeaF.readBoolean());

        System.out.println(a.toString());

        return a;
    }

    public void remove() {

    }

}
