/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.objectAssignment;

import java.util.Objects;

/**
 *
 * @author ARIAN
 */
public class SocialMediaUser {

        private static final int RED = 1;
        private static final int ORANGE = 2;
         private static final int YELLOW = 3;
          private static final int GREEN = 4;
           private static final int BLUE = 5;
    
    private static int lastIdUsed = 0;

    private int age;
    private int profileColour;
    private String username;
    private String password;
    private boolean isValidUser;

    public SocialMediaUser() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    //@Override
    public boolean equals(SocialMediaUser a) {
        if (a == null) {
            return false;
        }
      
        final SocialMediaUser other = (SocialMediaUser) a;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

 


    
 
    
    

}
