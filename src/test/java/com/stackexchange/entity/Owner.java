package com.stackexchange.entity;

public class Owner {

    public int reputation;
    public int user_id;
    public String user_type;
    public String profile_image;
    public String display_name;
    public String link;
    public int accept_rate;

    public Owner(int reputation, int user_id, String user_type, String profile_image, String display_name, String link, int accept_rate) {
        this.reputation = reputation;
        this.user_id = user_id;
        this.user_type = user_type;
        this.profile_image = profile_image;
        this.display_name = display_name;
        this.link = link;
        this.accept_rate = accept_rate;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getAccept_rate() {
        return accept_rate;
    }

    public void setAccept_rate(int accept_rate) {
        this.accept_rate = accept_rate;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "reputation=" + reputation +
                ", user_id=" + user_id +
                ", user_type='" + user_type + '\'' +
                ", profile_image='" + profile_image + '\'' +
                ", display_name='" + display_name + '\'' +
                ", link='" + link + '\'' +
                ", accept_rate=" + accept_rate +
                '}';
    }
}
