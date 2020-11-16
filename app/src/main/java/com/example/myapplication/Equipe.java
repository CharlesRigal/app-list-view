package com.example.myapplication;

import android.widget.ImageView;

public class Equipe {
    int id;
    String Name;
    String Wording;
    String Image;

    public Equipe(int id, String name, String wording, String image) {
        this.id = id;
        Name = name;
        Wording = wording;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getWording() {
        return Wording;
    }

    public void setWording(String wording) {
        Wording = wording;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
