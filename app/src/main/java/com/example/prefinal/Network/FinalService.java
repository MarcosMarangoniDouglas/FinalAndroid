package com.example.prefinal.Network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FinalService {


    final static String IPADDRESS = "http://10.0.2.2:8007/";


    public static Retrofit retrofit;

    private static String username;
    private static String password;

    public static void setCredentials(String newUsername, String newPassword) {
        username = newUsername;
        password = newPassword;
    }

    public static void clearCredentials() {
        username = "";
        password = "";
    }

    public static Retrofit getInstance() {

        OkHttpClient client = new OkHttpClient
                .Builder()
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(IPADDRESS)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit;
    }
}