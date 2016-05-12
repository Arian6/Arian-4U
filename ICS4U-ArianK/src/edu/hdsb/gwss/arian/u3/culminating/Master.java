/* Name: Master
 * Version: v5
 * Date: May 2 2016
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.arian.u3.culminating;


public class Master extends Lock {

    public static final int COMBO_MAX = 39;
    public static final int COMBO_LENGTH = 3;
    
    public Master() {
        super();
        this.comboGenerator(COMBO_LENGTH, COMBO_MAX);
    }

  

}