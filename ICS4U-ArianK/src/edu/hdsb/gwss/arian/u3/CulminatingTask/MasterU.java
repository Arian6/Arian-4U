/* Name: MasterU
 * Version: v5
 * Date: May 2 2016
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.arian.u3.CulminatingTask;

public class MasterU extends Lock {

    public static final int COMBO_MAX = 9;
    public static final int COMBO_LENGTH = 4;

    public MasterU() {
        super();
        this.comboGenerator(COMBO_LENGTH, COMBO_MAX);
    }

    protected void setCombo(int num1, int num2, int num3, int num4) {
        if (this instanceof MasterU) {
            this.getterCount = 0;
            this.unlockTries = 0;
            clearLock(4);

            if (isValid(num1, 9) && isValid(num2, 9) && isValid(num3, 9) && isValid(num4, 9)) {
                this.lockCombo.add(num1);
                this.lockCombo.add(num2);
                this.lockCombo.add(num3);
                this.lockCombo.add(num4);
            } else {

                System.out.println("Re-enter lock combo");
            }
        } else {
            System.out.println("Lock is not configurable");
        }
    }

    public void unlock(int num1, int num2, int num3, int num4) {

        this.unlockTries++;
        if (unlockTries <= 3) {
            if (this.lockCombo.get(0).equals(num1) && this.lockCombo.get(1).equals(num2) && this.lockCombo.get(2).equals(num3) && this.lockCombo.get(3).equals(num4)) {
                System.out.println("The lock has been unlocked!");
                this.locked = false;
                this.unlockTries = 0;

            } else {
                System.out.println("Wrong Combination");
                this.locked = true;
            }
        } else {
            System.out.println("Out of tries!");
        }

    }

}
