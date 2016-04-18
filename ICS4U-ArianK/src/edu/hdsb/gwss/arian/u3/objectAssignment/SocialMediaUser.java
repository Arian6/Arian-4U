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
    private SocialMedia media;

    public SocialMediaUser() {
    }

    public SocialMediaUser(String password) {
        this.password = password;
    }

    public SocialMediaUser(int age, int profileColour, String username, String password, boolean isValidUser) {
        this.age = age;
        this.profileColour = profileColour;
        this.username = username;
        this.password = password;
        this.isValidUser = isValidUser;
    }

    public static int getLastIdUsed() {
        return lastIdUsed;
    }

    public static void setLastIdUsed(int lastIdUsed) {
        SocialMediaUser.lastIdUsed = lastIdUsed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getProfileColour() {
        return profileColour;
    }

    public void setProfileColour(int profileColour) {
        this.profileColour = profileColour;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsValidUser() {
        return isValidUser;
    }

    public void setIsValidUser(boolean isValidUser) {
        this.isValidUser = isValidUser;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SocialMediaUser other = (SocialMediaUser) obj;
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



}
