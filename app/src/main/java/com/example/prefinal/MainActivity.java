package com.example.prefinal;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.prefinal.DB.AfricanCrisis;
import com.example.prefinal.DB.Country;
import com.example.prefinal.Network.FinalService;
import com.example.prefinal.Network.IFinalService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
implements TopFragment.OnFragmentInteractionListener{

    IFinalService finalService = FinalService.getInstance().create(IFinalService.class);
    ArrayList<Country> countries = new ArrayList<>();
    ListView listView;

    TopFragment topFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        finalService.getCountries().enqueue(new Callback<ArrayList<Country>>() {
            @Override
            public void onResponse(Call<ArrayList<Country>> call, Response<ArrayList<Country>> response) {
                countries = response.body();
                topFragment = TopFragment.newInstance(countries);
                getSupportFragmentManager()
                  .beginTransaction()
                  .replace(R.id.topFragmentContainer, topFragment)
                  .commit();
            }

            @Override
            public void onFailure(Call<ArrayList<Country>> call, Throwable t) {
            }
        });
    }

    @Override
    public void onFragmentInteraction(String code) {
        finalService.getAfricanCrisisByCode(code).enqueue(new Callback<ArrayList<AfricanCrisis>>() {
            @Override
            public void onResponse(Call<ArrayList<AfricanCrisis>> call, Response<ArrayList<AfricanCrisis>> response) {
                getSupportFragmentManager()
                  .beginTransaction()
                  .replace(R.id.bottomFragmentContainer, BottomFragment.newInstance(response.body()))
                  .commit();
            }

            @Override
            public void onFailure(Call<ArrayList<AfricanCrisis>> call, Throwable t) {
                Log.d("DBX", t.getMessage());
            }
        });
    }
}
