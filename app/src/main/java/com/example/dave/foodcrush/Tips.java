package com.example.dave.foodcrush;

public class Tips {
private String id,About,Tip;

    public Tips(String id, String about, String tip) {
        this.id = id;
        About = about;
        Tip = tip;
    }

    public String getId() {
        return id;
    }

    public String getAbout() {
        return About;
    }

    public String getTip() {
        return Tip;
    }
}
