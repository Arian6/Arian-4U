/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.objectAssignment;

/**
 *
 * @author ARIAN
 */
public class SocialMediaClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SocialMedia facebook = new SocialMedia();
        SocialMedia twitter = new SocialMedia();
        
        SocialMediaUser account1 = new SocialMediaUser( "ak", "123", facebook );
        SocialMediaUser account2 = new SocialMediaUser( "ak", "123", twitter );
        
        twitter.add( account2 );
        facebook.add( account1 );
        
    }
    
}
