package com.example.prefinal.Network;

import com.example.prefinal.DB.AfricanCrisis;
import com.example.prefinal.DB.Country;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IFinalService {

    @GET("countries")
    Call<ArrayList<Country>> getCountries();

    @GET("african_crisis")
    Call<ArrayList<AfricanCrisis>> getAfricanCrisis();

    @GET("countries/{code}")
    Call<ArrayList<AfricanCrisis>> getAfricanCrisisByCode(@Path("code") String code);

}
