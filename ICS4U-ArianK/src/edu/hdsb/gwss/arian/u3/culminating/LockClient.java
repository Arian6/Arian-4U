/* Name: LockClient
 * Version: v5
 * Date: May 2 2016
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.arian.u3.culminating;

public class LockClient {

    public static void main(String[] args) {
        // set locks
        Master m = new Master();
        Dudley d = new Dudley();
        Android a = new Android();
        MasterU mu = new MasterU();

        //serial numbers
        System.out.println(m.getSerialNumber());
        System.out.println(d.getSerialNumber());
        System.out.println(a.getSerialNumber());
        System.out.println(mu.getSerialNumber());

        //getter
        m.getLockCombo();
        m.getLockCombo();
        System.out.println();
        d.getLockCombo();
        d.getLockCombo();
        System.out.println();
        a.getLockCombo();
        a.getLockCombo();
        System.out.println();
        mu.getLockCombo();
        mu.getLockCombo();
        System.out.println();

        //set combo
        m.setCombo(4, 4, 4);
        m.getLockCombo();
        System.out.println();
        d.setCombo(4, 4, 4);
        d.getLockCombo();
        System.out.println();
        a.setCombo(4, 4, 4);
        a.getLockCombo();
        System.out.println();
        mu.setCombo(4, 4, 4, 4);
        mu.getLockCombo();
        System.out.println();

        //lock
        m.lock();
        d.lock();
        a.lock();
        mu.lock();

        //unlock invalid - 3 tries only
        m.unlock(5, 5, 5);
        m.unlock(5, 5, 5);
        m.unlock(5, 5, 5);
        m.unlock(5, 5, 5);
        System.out.println();
        d.unlock(5, 5, 5);
        d.unlock(5, 5, 5);
        d.unlock(5, 5, 5);
        d.unlock(5, 5, 5);
        System.out.println();
        a.unlock(5, 5, 5);
        a.unlock(5, 5, 5);
        a.unlock(5, 5, 5);
        a.unlock(5, 5, 5);
        System.out.println();
        mu.unlock(5, 5, 5, 5);
        mu.unlock(5, 5, 5, 5);
        mu.unlock(5, 5, 5, 5);
        mu.unlock(5, 5, 5, 5);

        //reset
        a.setCombo(3, 3, 3);
        mu.setCombo(3, 3, 3, 3);

        //unlock valid
        System.out.println();
        a.unlock(3, 3, 3);

        System.out.println();
        mu.unlock(3, 3, 3, 3);
        
        

    }

}
