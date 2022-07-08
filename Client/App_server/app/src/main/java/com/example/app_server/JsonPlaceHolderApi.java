package com.example.app_server;
import android.database.Observable;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Field;

public interface JsonPlaceHolderApi {
    @GET("/api")
    Call<Object> getPosts();

    @POST("/auth/register")
    Call < Object > signup(@Body UserInfo info);

    @POST("/auth/login")
    @FormUrlEncoded
    Call < Object > login(@Field("user_id") String user_id,
                          @Field("password") String password);
}