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
//
        SocialMediaAccount account1 = new SocialMediaAccount();
      SocialMediaAccount account2 = new SocialMediaAccount(facebook, "arian_k", "1234");
      SocialMediaAccount account3 = new SocialMediaAccount(twitter, "arian_16", "4321", 16, 5, true);
      
      SocialMediaAccount invalidAccount = new SocialMediaAccount(twitter, "arian_16", "4321", -1, 61, true);
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
        //pre
           //post
           
        assert (account1.getUsername() == null);
        assert (account1.getMedia() == null);
        assert (account1.getProfileColourID() == 0);
        assert (account1.getProfileColour().equals("unknown"));
        assert (account1.getSocialId() == 0);
        assert (account1.getAge() == 0);
        
        
        //primary key
        //pre
        //post
        //I would have asserts for passwords, but user should not be able to call
        //getpassword therefore it is a private class
      
        assert (account2.getUsername().equals("arian_k"));
        assert (account2.getMedia().equals(facebook));
       
        // full constructor
        
        assert (account3.getUsername().equals("arian_16"));
        assert (account3.getMedia().equals(twitter));
        assert (account3.getProfileColourID() == 5);
        assert (account3.getProfileColour().equals("blue"));
        assert (account3.getSocialId() == 2);
        assert (account3.getAge() == 16);
        
        //isvalid
         assert (invalidAccount.isValid() == false);
         
         //add invalid
         
        assert( facebook.getUsers().size() == 0);
        facebook.add( invalidAccount );
        assert( facebook.getUsers().size() == 0);
        
        

    }

}
