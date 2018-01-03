package com.example.hackro.retrofit1.com.hackro.views;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
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
        //Recuerda que para la autenticacion basica,estamos ocupando Base64
        String auth = "Basic " + Base64.encodeToString(String.format("%s:%s", "tutoriales", "hackro").getBytes(), Base64.NO_WRAP);
        Log.e("+++++ ",auth);//Mostramos en consola el valor de  auth
        //Esperamos un string,no un objeto
        //Call<String> call = serviceTuto.auth(auth);//Mandamos a llamar el servicio,mandando el encabezado

        /*call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.e("Exito test:   ",response.body().toString());//Mostramos el contenido de el response
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("Error test:   ",t.toString());
            }
        });
        */

        //Mandamos a llamar el servicio,mandando el objeto que sera el body
        Call<ResponseService> call = serviceTuto.body(new ResponseService(1,"d","s","v"));

        call.enqueue(new Callback<ResponseService>(){

            @Override
            public void onResponse(Call<ResponseService> call, Response<ResponseService> response) {
                Log.e("Exito test:   ",response.body().toString());//Mostramos el contenido de el response

            }

            @Override
            public void onFailure(Call<ResponseService> call, Throwable t) {
                Log.e("Error test:   ",t.toString());

            }
        });



    }

}
