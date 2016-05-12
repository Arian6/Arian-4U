/* Name: LockInterface
 * Version: v5
 * Date: May 2 2016
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.arian.u3.culminating;

import java.util.ArrayList;

public interface LockInterface {

    ArrayList<Integer> getLockCombo();

    void setCombo(int num1, int num2, int num3);

    int getSerialNumber();

    void lock();

    void unlock(int num1, int num2, int num3);

}
