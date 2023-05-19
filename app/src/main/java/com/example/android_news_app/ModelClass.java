package com.example.android_news_app;

public class ModelClass {

    //all variables to get from the API GET
    private String title, author, published_date, link, summary, media;

    //constructor
    public ModelClass(String title, String author, String published_date, String link, String summary, String media) {
        this.title = title;
        this.author = author;
        this.published_date = published_date;
        this.link = link;
        this.summary = summary;
        this.media = media;
    }


    //getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
}
