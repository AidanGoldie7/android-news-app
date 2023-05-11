package com.example.android_news_app;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    //base url of API website
    String BASE_URL="https://docs.newscatcherapi.com/";


    //latest headlines
    @GET("latest-headlines")
    Call<mainNews> getNews(
            @Query("country") String country,
            @Query("pageSize") int pageSize,
            @Query("apiKey") String apikey
    );



    @GET("latest-headlines")
    Call<mainNews> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pageSize,
            @Query("apiKey") String apikey

            );
}
