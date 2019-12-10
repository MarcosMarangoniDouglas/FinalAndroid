package com.example.prefinal.Network;

import com.example.prefinal.DB.Country;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IFinalService {

    @GET("countries")
    Call<ArrayList<Country>> getCountries();
}
