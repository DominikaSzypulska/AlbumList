package com.example.zadanie1;

import android.content.Context;
import android.media.MediaPlayer;

public class Album {
    private String name, title;
    private Integer picture;
    private MediaPlayer music;

    public Album(Context context, String name, String title, Integer picture, Integer musicid) {
        this.name = name;
        this.title = title;
        this.picture = picture;
        this.music = MediaPlayer.create(context, musicid);
    }

    public void start() {
        music.start();
    }

    public void stop() {
        music.stop();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPicture() {
        return picture;
    }

    public void setPicture(Integer picture) {
        this.picture = picture;
    }
}
