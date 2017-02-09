package com.example.hackro.retrofit1.com.hackro.views;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.hackro.retrofit1.R;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String url = "https://androidtutorials.herokuapp.com/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();



        servicesTutorial serviceTuto = retrofit.create(servicesTutorial.class);

        //Recibimos un objeto y no una lista de objetos
        Call<ResponseService> call = serviceTuto.findUserGet(1);

        call.enqueue(new Callback<ResponseService>() {
            @Override
            public void onResponse(Call<ResponseService> call, Response<ResponseService> response) {
                Log.e("Users:    ",response.body().getId()+" "+response.body().getName());
            }

            @Override
            public void onFailure(Call<ResponseService> call, Throwable t) {
                Log.e("Error:   ",t.toString());
            }
        });



    }

}
