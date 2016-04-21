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
public class SocialMediaAccount {

    private static final String[] COLOURS = {"unknown", "red", "orange", "yellow", "green", "blue"};

    private static final int UNKNOWN = 0;
    private static final int RED = 1;
    private static final int ORANGE = 2;
    private static final int YELLOW = 3;
    private static final int GREEN = 4;
    private static final int BLUE = 5;

    private static int lastIdUsed = 0;

    private SocialMedia media;
    private String username;
    private String password;
    private int age;
    private int profileColourID;
    private int socialId;
    private boolean ValidAccount;

    public SocialMediaAccount() {
        this.socialId = lastIdUsed;
        this.ValidAccount = false;

    }

    public SocialMediaAccount(SocialMedia media, String username, String password) {
        this.socialId = ++lastIdUsed;
        this.ValidAccount = true;
        this.username = username;
        this.password = password;
        this.media = media;
    }

    public SocialMediaAccount(SocialMedia media, String username, String password, int age, int profileColourID, boolean isValidAccount) {
        this.socialId = ++lastIdUsed;
        this.media = media;
        this.username = username;
        this.password = password;
        this.age = age;
        this.profileColourID = profileColourID;
        this.ValidAccount = isValidAccount;
    }

    public static int getLastIdUsed() {
        return lastIdUsed;
    }

    private static void setLastIdUsed(int lastIdUsed) {

        System.out.println("Sorry, but this cannot be changed");
    }

    public SocialMedia getMedia() {
        return media;
    }

    public void setMedia(SocialMedia media) {
        if (media == null) {
            System.out.println("Sorry. Can't set Media");
            this.media = null;
        } else {

            this.media = media;

        }
    }

    public String getUsername() {
        return username;
    }

    private void setUsername(SocialMedia x, String username) {

        if (uniqueUsername(x, this.username) == true) {
            this.username = username;
        } else if (this.username.length() <= 0 || this.username.length() > 16) {
            System.out.println("Username invalid");
        } else {
            System.out.println("Username already taken");
        }

    }

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        if (this.password.length() < 6 || this.password.length() > 16) {
            System.out.println("invalid password");
            this.password = null;
        } else {
            this.password = password;
        }
    }

    public int getSocialId() {
        return socialId;
    }

    private void setSocialId(int socialId) {
        if (this.socialId <= 0) {
            System.out.println("Invalid Id");
            this.socialId = -1;
        } else {
            this.socialId = ++lastIdUsed;
            this.socialId = socialId;
        }
    }

    public boolean isIsValidAccount() {
        return ValidAccount;
    }

    public void setIsValidAccount(boolean isValidAccount) {

        if (this.media == null || this.username == null || this.password == null) {
            System.out.println("Invalid Account");
            this.ValidAccount = false;
        }
        this.ValidAccount = isValidAccount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age < 12 || this.age > 99) {
            System.out.println("Invalid");
            this.age = -1;
        } else {
            this.age = age;
        }
    }

    public int getProfileColourID() {
        return profileColourID;
    }

    public String getProfileColour() {
        return COLOURS[profileColourID];
    }

    public void setProfileColourID(int profileColour) {
        if (this.profileColourID <= 0 || this.profileColourID > 5) {
            System.out.println("Invalid Profile Colour");
            this.profileColourID = 1;
        } else {
            this.profileColourID = profileColour;
        }
    }

    public boolean equals(SocialMediaAccount account) {
        if (this == account) {
            return true;
        }
        if (account == null) {
            return false;
        }
        if (getClass() != account.getClass()) {
            return false;
        }
        final SocialMediaAccount other = (SocialMediaAccount) account;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.media, other.media)) {
            return false;
        }
        return true;
    }

    public boolean isValid() {
        if (this.username == null || this.username.length() == 0) {
            return false;
        }
        if (this.username.length() <= 0 || this.username.length() > 16) {
            return false;
        }
        if (uniqueUsername(this.media, this.username) == false) {
            return false;
        }
        if (this.password == null && this.password.length() < 6 || this.password.length() > 16) {
            return false;
        }
        if (this.media == null) {
            return false;
        }
        if (this.socialId <= 0) {
            return false;
        }
        return true;
    }

    public boolean uniqueUsername(SocialMedia a, String username) {
        boolean verify = false;

        for (int i = 0; i < a.users.size(); i++) {
            if (a.users.get(i).username == username) {
                verify = false;
                i = a.users.size();
            } else {
                verify = true;
            }
        }

        return verify;
    }

    public String toString() {
        return "Media Platofrm: " + media.getPlatform() + ", Account # : " + socialId + " ---//    INFO: " + "username= " + username + ", password= " + password + ", age= " + age + ", profileColour= " + COLOURS[profileColourID] + ", Valid Account = " + ValidAccount;
    }

}
