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

    private static final int TWITTER = 1;
    private static final int ORANGE = 2;
    private static final int YELLOW = 3;
    private static final int GREEN = 4;
    private static final int BLUE = 5;

    private static int lastIdUsed = 0;

    private SocialMedia media;
    private String username;
    private String password;
    private int age;
    private int profileColour;
    private int socialId;
    private boolean isValidAccount;

    public SocialMediaAccount() {
        this.socialId = ++lastIdUsed;
        this.isValidAccount = false;
        this.media = media;
    }

    public SocialMediaAccount(SocialMedia media, String username, String password) {
        this.media = media;
    }

    public static int getLastIdUsed() {
        return lastIdUsed;
    }

    public static void setLastIdUsed(int lastIdUsed) {
        SocialMediaAccount.lastIdUsed = lastIdUsed;
    }

    public SocialMedia getMedia() {
        return media;
    }

    public void setMedia(SocialMedia media) {
        this.media = media;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
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

    public int getProfileColour() {
        return profileColour;
    }

    public void setProfileColour(int profileColour) {
        if (this.profileColour <= 0 || this.profileColour > 5) {
            System.out.println("Invalid Profile Colour");
            this.profileColour = 1;
        } else {
            this.profileColour = profileColour;
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

    public boolean isValid(SocialMediaAccount account) {
        if (this.username != null) {
            return true;
        }
        if (this.password != null) {
            return true;
        }
        if (this.media != null) {
            return true;
        }
        if (this.socialId <= socialId && this.socialId >= 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Media Platofrm: " + media + ", Account # : " + socialId + " ---//    INFO: " + "username= " + username + ", password= " + password + ", age= " + age + ", profileColour= " + profileColour;
    }

}
