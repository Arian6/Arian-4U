/* Name: SocialMedia
 * Version: v1
 * Date: April 22 2016
 * Author: Arian Krasniqi
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
    private double netWorth;
    private boolean monetized;
    protected ArrayList<SocialMediaAccount> users = new ArrayList<SocialMediaAccount>();

    public SocialMedia() {

        this.monetized = false;
    }

    public SocialMedia(String platform) {

        this.platform = platform;
    }

    public SocialMedia(String platform, double netWorth, boolean monetized) {
        this.platform = platform;
        this.netWorth = netWorth;
        this.monetized = monetized;
    }

    public int getNumberOfUsers() {
        return users.size();
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

    public boolean isMonetized() {
        return monetized;
    }

    public void setMonetized(boolean monetized) {
        if (this.netWorth <= 0) {
            System.out.println("This social media is not monetized");
            this.monetized = false;

        }
        this.monetized = monetized;
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

        return true;
    }

    public boolean isValid() {
        if (this.platform == null && this.platform.length() == 0) {
            return false;
        }
        if (this.platform.length() < 0 || this.platform.length() > 16) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SocialMedia{" + "platform=" + platform + ", userAmount=" + getNumberOfUsers() + ", netWorth=" + netWorth + ", Monetized=" + monetized + '}';
    }

    public void add(SocialMediaAccount account) {

        if (account == null) {
            System.out.println("Cannot add empty account");
        } else if (users.contains(account)) {
            System.out.println("Account already exists!");
        } else if (account.isValid() == false) {
            System.out.println("Cannot add invalid account");
        } else {
            this.users.add(account);
            System.out.println(account.getUsername() + " is now added");
        }
    }

    public void remove(SocialMediaAccount account) {

        if (users.contains(account)) {
            this.users.remove(account);
            System.out.println(account.getUsername() + " is now removed");

        } else {
            System.out.println("Cannot remove account that is not in the list!");
        }
    }

    public SocialMediaAccount get(String username) {

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                System.out.println("Account exists, getting account");
                return users.get(i);
            }
        }
        return null;
    }

}
