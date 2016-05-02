/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.CulminatingTask;

import java.util.ArrayList;


/**
 *
 * @author ARIAN
 */
public class MasterU extends Lock  {

    public static final int COMBO_MAX = 9;
    public static final int COMBO_LENGTH = 4;
    
    public MasterU() {
        super();
        this.comboGenerator(COMBO_LENGTH, COMBO_MAX);
    }
    
    


  
}
