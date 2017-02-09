package com.example.hackro.retrofit1.com.hackro.views;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.hackro.retrofit1.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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


        Gson gson  = new GsonBuilder().setLenient().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        servicesTutorial serviceTuto = retrofit.create(servicesTutorial.class);
        //Esperamos un string,no un objeto
        Call<String> call = serviceTuto.findUserPost("hackro");//Enviamos el valor de el parametro name


        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.e("Exito:   ",response.body().toString());//Mostramos el contenido de el response
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("Error:   ",t.toString());
            }
        });



    }

}
