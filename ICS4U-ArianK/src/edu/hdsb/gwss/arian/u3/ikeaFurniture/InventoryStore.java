/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.ikeaFurniture;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        ikeaF.writeBytes(f.getName());
        ikeaF.writeBytes(f.getTypeOfFurniture());
        ikeaF.writeBytes(f.getMaterial());
        ikeaF.writeDouble(f.getPrice());
        ikeaF.writeChar(f.getDifficulty());
        ikeaF.writeBoolean(f.isInStock());

        return f;

    }

    public InventoryRecord update(InventoryRecord f) throws IOException {

        return write(f);

    }

    public InventoryRecord add(InventoryRecord f) throws IOException {
        return write(f);

    }

    public void read() {

    }

}
