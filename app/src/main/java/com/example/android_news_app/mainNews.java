package com.example.android_news_app;

import java.util.ArrayList;

public class mainNews {
    //variable initialisation
    private String status;
    private String totalResults;
    //to pull from 'articles' array in documentation on newscatcher API website
    private ArrayList<ModelClass> articles;

    //constructor
    public mainNews(String status, String totalResults, ArrayList<ModelClass> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    //getter and setter
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}
