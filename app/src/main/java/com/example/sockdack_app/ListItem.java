package com.example.sockdack_app;

import android.graphics.drawable.Drawable;
import android.media.Image;

import java.util.List;

public class ListItem {
    private Drawable bookcover;
    private String booktitle;
    private String bookauthor;

    public Drawable getBookcover(){
        return this.bookcover;
    }
    public void setBookcover(Drawable bookcover){
        this.bookcover = bookcover;
    }

    public String getBooktitle(){
        return booktitle;
    }

    public void setBooktitle(String booktitle){
        this.booktitle = booktitle;
    }

    public String getBookauthor(){
        return bookauthor;
    }

    public void setBookauthor(String bookauthor){
        this.bookauthor = bookauthor;
    }

    ListItem(String booktitle, String bookauthor, Drawable bookcover){
        this.booktitle = booktitle;
        this.bookauthor = bookauthor;
        this.bookcover = bookcover;
    }
}
