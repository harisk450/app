package com.example.app.model;

public class Author {
    public int profileid;
    public String profilePicUrl;
    public String name;
    public String description;

    public Author(int profileid, String profilePicUrl, String name, String description) {
        this.profileid = profileid;
        this.profilePicUrl = profilePicUrl;
        this.name = name;
        this.description = description;
    }

    public int getProfileid() {
        return profileid;
    }

    public void setProfileid(int profileid) {
        this.profileid = profileid;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
