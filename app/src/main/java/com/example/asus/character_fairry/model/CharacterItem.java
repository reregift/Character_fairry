package com.example.asus.character_fairry.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.asus.character_fairry.R;

public class CharacterItem {
    public final int id;
    public final String title;
    public final String detail;
    public final String type;
    public final String picture;

    public CharacterItem(int id, String title, String detail, String type, String picture) {
        this.id = id;
        this.title = title;
        this.detail = detail;
        this.type = type;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return title;
    }
}
