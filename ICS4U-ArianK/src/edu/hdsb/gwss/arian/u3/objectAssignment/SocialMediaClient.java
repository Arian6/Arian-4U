/* Name: SocialMediaClient
 * Version: v1
 * Date: April 21 2016
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.arian.u3.objectAssignment;

public class SocialMediaClient {

    public static void main(String[] args) {

        SocialMedia facebook = new SocialMedia();
        SocialMedia twitter = new SocialMedia();

//        SocialMediaAccount account1 = new SocialMediaAccount();
//      SocialMediaAccount account2 = new SocialMediaAccount(facebook, "arian_k", "123445");
//      SocialMediaAccount account3 = new SocialMediaAccount(twitter, "arian_16", "432145", 16, 5, true);
//      
//     account3.isValid();
//      
//      SocialMediaAccount invalidAccount = new SocialMediaAccount(twitter, "arian_16", "4321", -1, 61, true);
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
//        facebook.add( account3 );
//        facebook.add( null );
//        facebook.add( new SocialMediaAccount() );
//        System.out.println( facebook.getNumberOfUsers() );
//        
//         System.out.println(facebook.toString());
        /*
         TEST #1: Empty Constructor
         PRE-CONDTION:
         - none
  
         POST-CONDTION:
         - Username is null
         - Media is not set therfore null
         - profile colour id is 0, colour is unknown
         - social id is zero as not registered account
         - age is 0
         */
        System.out.println("-------------------");
        System.out.println("TEST #1: Empty Constructor");
        SocialMediaAccount account1 = new SocialMediaAccount();
        assert (account1.getUsername() == null);
        assert (account1.getMedia() == null);
        assert (account1.getProfileColourID() == 0);
        assert (account1.getProfileColour().equals("unknown"));
        assert (account1.getSocialId() == 0);
        assert (account1.getAge() == 0);

        /*
         TEST #2: Primary Key Constructor
         PRE-CONDTION:
         - Media platform set
         - Username set
         - Password set
         POST-CONDTION:
         - Username is what username was given
         - Media is set to what was given
         - Password cannot bve recieved but is set
         - social id is 1 as new account created
         - age is 0
         */
        System.out.println("-------------------");
        System.out.println("TEST #2: Primary Key Constructor");
        SocialMediaAccount account2 = new SocialMediaAccount(facebook, "arian_k", "123456");
        assert (account2.getUsername().equals("arian_k"));
        assert (account2.getMedia().equals(facebook));
        assert (account2.getProfileColourID() == 0);
        assert (account2.getProfileColour().equals("unknown"));
        assert (account2.getSocialId() == 1);
        assert (account2.getAge() == 0);

        /*
         TEST #3: Full Account Constructor
         PRE-CONDTION:
         - All Valid Variables are set
         POST-CONDTION:
         - Social Id is now 2
         - All variables sent are now set
         */
        System.out.println("-------------------");
        System.out.println("TEST #3: Full Account Constructor");
        SocialMediaAccount account3 = new SocialMediaAccount(twitter, "arian_16", "123456", 16, 5, false);
        assert (account3.getUsername().equals("arian_16"));
        assert (account3.getMedia().equals(twitter));
        assert (account3.getProfileColourID() == 5);
        assert (account3.getProfileColour().equals("blue"));
        assert (account3.getSocialId() == 2);
        assert (account3.getAge() == 16);


        /*
         TEST #4: Is valid
         PRE-CONDTION:
         - An invalid account
         - Already Taken username
         - short password
         - invalid colour and age
         POST-CONDTION:
         - False
         */
        System.out.println("-------------------");
        System.out.println("TEST #4: Is Valid");
        SocialMediaAccount invalidAccount = new SocialMediaAccount(facebook, "arian_16", "4321", -1, 61, true);
        assert (invalidAccount.isValid() == false);

        //add valid account to the user
        //add invalid
        System.out.println("-------------------");
        System.out.println("TEST #5: Add Invalid");
        SocialMediaAccount addEmpty = new SocialMediaAccount();
        assert (facebook.getNumberOfUsers() == 0);
        facebook.add(addEmpty);
        assert (facebook.getNumberOfUsers() == 0);

        //ad valid
        System.out.println("-------------------");
        System.out.println("TEST #6: Add Valid");
        SocialMediaAccount account4 = new SocialMediaAccount(facebook, "arian_1667", "123456", 16, 5, true);
        assert (facebook.getNumberOfUsers() == 0);
        facebook.add(account4);
        assert (facebook.getNumberOfUsers() == 1);
        assert (facebook.users.contains(account4));

        System.out.println("-------------------");
        System.out.println("TEST #7: Remove invalid");
        SocialMediaAccount account5 = new SocialMediaAccount(facebook, "krasniqi", "123456", 16, 5, true);
        assert (!facebook.users.contains(account5));
        assert (facebook.getNumberOfUsers() == 1);
        facebook.remove(account5);
        assert (facebook.getNumberOfUsers() == 1);
        assert (!facebook.users.contains(account5));

        System.out.println("-------------------");
        System.out.println("TEST #7: Remove Valid");
        assert (facebook.users.contains(account4));
        assert (facebook.getNumberOfUsers() == 1);
        facebook.remove(account4);
        assert (facebook.getNumberOfUsers() == 0);
        assert (!facebook.users.contains(account4));

        System.out.println("-------------------");
        System.out.println("TEST #8: Get Valid");
        facebook.add(account4);
        assert (facebook.users.contains(account4));
        assert (facebook.get(account4).equals(account4));

        System.out.println("-------------------");
        System.out.println("TEST #9: Same Username");
        SocialMediaAccount account6 = new SocialMediaAccount(facebook, "arian_1667", "123456", 16, 5, true);
        assert (account4.uniqueUsername(facebook, "arian_1667") == false);
        
        System.out.println("-------------------");
        System.out.println("TEST #10: Unique Username");
        SocialMediaAccount account7 = new SocialMediaAccount(facebook, "krasniqi_", "123456", 16, 5, true);
        assert (account4.uniqueUsername(facebook, "krasniqi_") == true);
        
        System.out.println("-------------------");
        System.out.println("TEST #11: Equals");
        
        

    }

}
