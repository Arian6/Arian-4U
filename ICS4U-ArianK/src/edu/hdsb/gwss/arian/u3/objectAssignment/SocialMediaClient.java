/* Name: SocialMediaClient
 * Version: v1
 * Date: April 22 2016
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.arian.u3.objectAssignment;

public class SocialMediaClient {

    public static void main(String[] args) {

        // MR MUIR. - I COULDNT ASK YOU ABOUT THESE SO THESE ARE "SPECIAL" CASES IN MY CODE
        //
        // 1. THE REASON GET PASSWORD IS PRIVATE IS BECAUSE A USER SHOULD NOT BE ABLE TO SEE AN ACCOUNTS PASSWORD
        //
        // 2. THE REASON THERE IS NO CHECK FOR A NEGATIVE SOCIAL MEDIA NET WORTH, IS BECAUSE A STARTUP SOCIAL MEDIA
        //    MAY TECHNICALLY BE IN DEBT OR HAVE A NET WORTH < 0
        //
        // 3. ONLY HAVE ONE GET TESTER FOPR VALID ACCOUNT, BECAUSE INVALID ACCOUNTS CANNOT BE PUT INTO ARRAY ANYWAY
        //
        // 4. UNIQUE USERNAME IS CALLED IN IS VALID AND IS VALID IS CALLED EVERYWHERE ELSE, THAT IS WHY I DO NOT HAVE IT IN EQUALS OR ADD
        System.out.println("SOCIAL MEDIA CLASS TESTS");

        /*
         TEST #1: Empty Constructor
         PRE-CONDTION:
         - none
         POST-CONDTION:
         - all variables are null or zero
         - array list is empty
         */
        System.out.println("-------------------");
        System.out.println("TEST #1: Empty Constructor");
        SocialMedia snapchat = new SocialMedia();
        assert (snapchat.getPlatform() == null);
        assert (snapchat.isMonetized() == false);
        assert (snapchat.getNetWorth() == 0.0);
        assert (snapchat.getNumberOfUsers() == 0);
        assert (snapchat.getUsers().isEmpty());

        /*
         TEST #2: Primary Key Constructor
         PRE-CONDTION:
         - social media name given
         POST-CONDTION:
         - social media name set
         - 
         */
        System.out.println("-------------------");
        System.out.println("TEST #2: Primary Key");
        SocialMedia myspace = new SocialMedia("MySpace");
        assert (myspace.getPlatform().equals("MySpace"));
        assert (myspace.isMonetized() == false);
        assert (myspace.getNetWorth() == 0.0);
        assert (myspace.getNumberOfUsers() == 0);
        assert (myspace.getUsers().isEmpty());

        /*
         TEST #3: Full Account Constructor
         PRE-CONDTION:
         - All Valid Variables are set
         POST-CONDTION:
         - all variables are checked to be valid and set
         */
        System.out.println("-------------------");
        System.out.println("TEST #3: Full Constructor");
        SocialMedia facebook = new SocialMedia("facebook", 160, true);
        assert (facebook.getPlatform().equals("facebook"));
        assert (facebook.isMonetized() == true);
        assert (facebook.getNetWorth() == 160);
        assert (facebook.getNumberOfUsers() == 0);
        assert (facebook.getUsers().isEmpty());

        /*
         TEST #4: Invalid Social Media
         PRE-CONDTION:
         - invalid variables given
         POST-CONDITION:
         - Social media is not valid and no friends can be added to it        
         */
        System.out.println("-------------------");
        System.out.println("TEST #4: Invalid Social Media");
        SocialMedia friendster = new SocialMedia("friendster_thisNameIsTooLong", 160, true);
        assert (friendster.isValid() == false);

        /*
         TEST #5: Valid Social Media
         PRE-CONDTION:
         - Valid data entered
         POST-CONDITION:
         - Valid platform created
         */
        System.out.println("-------------------");
        System.out.println("TEST #5: Valid Social Media");
        SocialMedia twitter = new SocialMedia("twitter", 100, true);
        assert (twitter.isValid() == true);

        /*
         TEST #6: Does not equal
         PRE-CONDTION:
         - Two different social medias passed
         POST-CONDITION:
         - not the same social media
         */
        System.out.println("-------------------");
        System.out.println("TEST #6: not Equals");
        assert (facebook.equals(twitter) == false);

        /*
         TEST #7: Does  equal
         PRE-CONDTION:
         - Same Social Media passed
         POST-CONDITION:
         - not the same social media
         */
        System.out.println("-------------------");
        System.out.println("TEST #7:  Equals");
        assert (snapchat.equals(snapchat) == true);

        //DIVIDES PLATFORM CLASS AND ACCOUNT CLASS
        System.out.println("-------------------");
        System.out.println("SOCIAL MEDIA CLASS TESTS DONE");
        System.out.println("");
        System.out.println("");

        System.out.println("SOCIAL MEDIA ACCOUNT CLASS TESTS");

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
        assert (account1.isIsVerified() == false);
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
        assert (account2.isIsVerified() == false);
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
        SocialMediaAccount account3 = new SocialMediaAccount(twitter, "arian_16", "123456", 16, 5, true);
        assert (account3.getUsername().equals("arian_16"));
        assert (account3.getMedia().equals(twitter));
        assert (account3.isIsVerified() == true);
        assert (account3.getProfileColourID() == 5);
        assert (account3.getProfileColour().equals("blue"));
        assert (account3.getSocialId() == 2);
        assert (account3.getAge() == 16);


        /*
         TEST #4: Is invalid
         PRE-CONDTION:
         - An invalid account
         - Already Taken username
         - short password
         - invalid colour and age
         POST-CONDTION:
         - False
         */
        System.out.println("-------------------");
        System.out.println("TEST #4: Is inValid");
        SocialMediaAccount invalidAccount = new SocialMediaAccount(facebook, "arian_16", "4321", -1, 61, true);
        assert (invalidAccount.isValid() == false);

        /*
         TEST #5: Is Valid
         PRE-CONDTION:
         - Valid data
         POST-CONDTION:
         - Account is valid
         */
        System.out.println("-------------------");
        System.out.println("TEST #5: Is Valid");
        assert (account3.isValid() == true);

        /*
         TEST #6: Add invalid
         PRE-CONDTION:
         - Try to add invalid account to the arraylist
         POST-CONDTION:
         - Account is nopt added, array list size remains at zero
         */
        System.out.println("-------------------");
        System.out.println("TEST #6: Add Invalid");
        SocialMediaAccount addEmpty = new SocialMediaAccount();
        assert (facebook.getNumberOfUsers() == 0);
        facebook.add(addEmpty);
        assert (facebook.getNumberOfUsers() == 0);

        /*
         TEST #7: Add Valid
         PRE-CONDTION:
         - Try to add valid account to the arraylist
         POST-CONDTION:
         - Account is added to array, size increases to one
         */
        System.out.println("-------------------");
        System.out.println("TEST #7: Add Valid");
        SocialMediaAccount account4 = new SocialMediaAccount(facebook, "arian_1667", "123456", 16, 5, true);
        assert (facebook.getNumberOfUsers() == 0);
        facebook.add(account4);
        assert (facebook.getNumberOfUsers() == 1);
        assert (facebook.users.contains(account4));

        /*
         TEST #8: remove  inValid
         PRE-CONDTION:
         - Try to remove non existent account from the array
         POST-CONDTION:
         - array returns the account does not exist, returns same size
         */
        System.out.println("-------------------");
        System.out.println("TEST #8: Remove invalid");
        SocialMediaAccount account5 = new SocialMediaAccount(facebook, "krasniqi", "123456", 16, 5, true);
        assert (!facebook.users.contains(account5));
        assert (facebook.getNumberOfUsers() == 1);
        facebook.remove(account5);
        assert (facebook.getNumberOfUsers() == 1);
        assert (!facebook.users.contains(account5));

        /*
         TEST #9: remove  Valid
         PRE-CONDTION:
         - Try to remove account from the array
         POST-CONDTION:
         - Array removes the account, decreases size by 1, confirms account is not contained
         */
        System.out.println("-------------------");
        System.out.println("TEST #9: Remove Valid");
        assert (facebook.users.contains(account4));
        assert (facebook.getNumberOfUsers() == 1);
        facebook.remove(account4);
        assert (facebook.getNumberOfUsers() == 0);
        assert (!facebook.users.contains(account4));

        /*
         TEST #10: Get  Valid
         PRE-CONDTION:
         - Get account info
         POST-CONDTION:
         - Traces name to account, gets account
         */
        System.out.println("-------------------");
        System.out.println("TEST #10: Get Valid");
        facebook.add(account4);
        assert (facebook.users.contains(account4));
        assert (facebook.get("arian_1667").equals(account4));

        /*
         TEST #11: Same username
         PRE-CONDTION:
         - new account with the same username tried to be created
         POST-CONDTION:
         - uniqueUsername method returns false account due to same username
         */
        System.out.println("-------------------");
        System.out.println("TEST #11: Same Username");
        SocialMediaAccount account6 = new SocialMediaAccount(facebook, "arian_1667", "123456", 16, 5, true);
        assert (account4.uniqueUsername(facebook, "arian_1667") == false);

        /*
         TEST #12: Unique username
         PRE-CONDTION:
         - new account with new username tried to be created
         POST-CONDTION:
         - uniqueUsername method returns true, account is now created
         */
        System.out.println("-------------------");
        System.out.println("TEST #12: Unique Username");
        SocialMediaAccount account7 = new SocialMediaAccount(facebook, "krasniqi_", "123456", 16, 5, true);
        assert (account4.uniqueUsername(facebook, "krasniqi_") == true);

        /*
         TEST #13: not Equals
         PRE-CONDTION:
         - Two different accounts are passed
         POST-CONDTION:
         - equals confirms they are not the same
         */
        System.out.println("-------------------");
        System.out.println("TEST #13: not Equals");
        assert (account4.equals(account7) == false);

        /*
         TEST #14:  Equals
         PRE-CONDTION:
         - Same account is passed
         POST-CONDTION:
         - equals confirms IT is the same account
         */
        System.out.println("-------------------");
        System.out.println("TEST #14:  Equals");
        assert (account4.equals(account4) == true);

        System.out.println("-------------------");
        System.out.println("SOCIAL MEDIA ACCOUNT CLASS TESTS DONE");

        System.out.println("CODE WORKS!");

    }

}
