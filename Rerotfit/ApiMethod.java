package com.example.emans.myapplication.Rerotfit;


import com.example.emans.myapplication.Models.UserResponce;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;


public interface ApiMethod {
    @GET("users")
    Call<UserResponce>User(@QueryMap Map<String, String> query);
}
