package com.example.prefinal.Network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FinalService {
    final static String IPADDRESS = "http://ec2-54-91-231-87.compute-1.amazonaws.com:8000/";
    public static Retrofit retrofit;

    public static Retrofit getInstance() {
        if(retrofit == null) {
            OkHttpClient client = new OkHttpClient
              .Builder()
              .build();

            retrofit = new Retrofit.Builder()
              .baseUrl(IPADDRESS)
              .addConverterFactory(GsonConverterFactory.create())
              .client(client)
              .build();
        }
        return retrofit;
    }
}