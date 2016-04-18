/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.objectAssignment;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author ARIAN
 */
public class SocialMedia {
    
    private static final String Owner = "";
    
    private String name;
   
   
    private boolean isValid;
    private ArrayList<SocialMediaUser> users;
    
    public SocialMedia() {
    }

   
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SocialMedia other = (SocialMedia) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.users != other.users) {
            return false;
        }
        if (this.isValid != other.isValid) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
}
