/* Name: Dudley
 * Version: v5
 * Date: May 2 2016
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.arian.u3.CulminatingTask;

public class Dudley extends Lock {

    public static final int COMBO_MAX = 59;
    public static final int COMBO_LENGTH = 3;
    
    public Dudley() {
        super();
        this.comboGenerator(COMBO_LENGTH, COMBO_MAX);
    }

    
}