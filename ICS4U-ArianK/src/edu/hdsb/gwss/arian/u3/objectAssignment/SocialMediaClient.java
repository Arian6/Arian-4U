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

        SocialMediaAccount account1 = new SocialMediaAccount(twitter, "123", "asddf");

        System.out.println(account1.toString());

    }

}
