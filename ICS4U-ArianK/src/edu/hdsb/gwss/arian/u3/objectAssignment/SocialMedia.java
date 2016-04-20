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

    private String platform;
    private int userAmount;
    private double netWorth;
    private boolean isValidPlatform;

    protected ArrayList<SocialMediaAccount> users = new ArrayList<SocialMediaAccount>();

    public SocialMedia() {
        this.userAmount = users.size();
        this.isValidPlatform = false;
    }

    public SocialMedia(String platform) {
        this.platform = platform;
    }

    public SocialMedia(String platform, double netWorth, boolean isValid) {
        this.platform = platform;
        this.netWorth = netWorth;
        this.isValidPlatform = isValid;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        if (this.platform == null) {
            System.out.println("Not a real social media");
        } else if (this.platform.length() < 0 || this.platform.length() > 16) {
            System.out.println("Platform is invalid");
            this.platform = null;
        } else {
            this.platform = platform;
        }
    }

    private int getUserAmount() {

        return users.size();
    }

    public void setUserAmount(int userAmount) {
        if (this.userAmount != users.size()) {
            System.out.println("Not the correct amount of users");

        } else {
            this.userAmount = users.size();
        }
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(double netWorth) {
        if (this.netWorth < 0) {
            System.out.println("Join something else");
        } else {
            this.netWorth = netWorth;
        }
    }

    public boolean isIsValid() {
        return isValidPlatform;
    }

    public void setIsValid(boolean isValid) {
        this.isValidPlatform = isValid;
    }

    public ArrayList<SocialMediaAccount> getUsers() {
        return users;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SocialMedia other = (SocialMedia) obj;
        if (!Objects.equals(this.platform, other.platform)) {
            return false;
        }
        if (this.users != other.users) {
            return false;
        }
        if (this.isValidPlatform != other.isValidPlatform) {
            return false;
        }
        return true;
    }

    public boolean isValid() {
        if (this.platform == null && this.platform.length() == 0) {
            return false;
        }
        if (this.userAmount <= 0) {
            return false;
        }
        if (this.isValidPlatform == false) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "SocialMedia{" + "platform=" + platform + ", userAmount=" + users.size() + ", netWorth=" + netWorth + ", isValidPlatform=" + isValidPlatform + '}';
    }
    
    

}
