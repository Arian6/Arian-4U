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
//
        SocialMediaAccount account1 = new SocialMediaAccount(facebook, "ak", "123", 16, 3, true);
//        SocialMediaAccount account2 = new SocialMediaAccount(facebook, "sdfk", "123", 16, 3, true);
//        SocialMediaAccount account3 = new SocialMediaAccount(facebook, "ghdgfk", "123", 16, 3, true);
//
//        facebook.add(account1);
//        facebook.add(account2);
//        facebook.add(account3);
//
//        System.out.println(account3.getUsername());
//      
//        account3.setUsername( facebook, "ak");
//        System.out.println(account3.getUsername());
//
////        facebook.add( account3 );
////        facebook.add( null );
////        facebook.add( new SocialMediaAccount() );
////        System.out.println( facebook.getNumberOfUsers() );
//        // System.out.println(facebook.toString());
//        

        //Test 1 Empty constructer
        assert (account1.getUsername() == null);
        assert (facebook.getNumberOfUsers() == 0);
        assert (facebook.getNetWorth() == 0);
        assert (facebook.getUsers().isEmpty());

    }

}
