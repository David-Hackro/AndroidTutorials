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

        Call<List<ResponseService>> call = serviceTuto.getUsersPost();

        //Apartir de aqui la forma cambia de la manera sincrona a la asincrona
        //basicamente mandamos a llamar el metodo enqueue, y le pasamos como parametro el call back
        //Recuerda que el IDE es para ayudarte asi que lo creara automaticamente al escribir "new"
        call.enqueue(new Callback<List<ResponseService>>() {

            //Metodo que se ejecutara cuando no hay problemas y obtenemos respuesta del server
            @Override
            public void onResponse(Call<List<ResponseService>> call, Response<List<ResponseService>> response) {
                //Exactamente igual a la manera sincrona,la respuesta esta en el body
                for(ResponseService res : response.body()) {
                    Log.e("Usuario: ",res.getId()+" "+res.getNickName());
                }
            }

            //Metodo que se ejecutara cuando ocurrio algun problema
            @Override
            public void onFailure(Call<List<ResponseService>> call, Throwable t) {
                Log.e("onFailure",t.toString());// mostrmos el error
            }
        });

    }

    //Peticion  Sincrona
  public static class Peticion extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... voids) {

            final  String url = "https://androidtutorials.herokuapp.com/";

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            servicesTutorial service = retrofit.create(servicesTutorial.class);

            Call<List<ResponseService>> response = service.getUsersPost();

            try {
                for (ResponseService user : response.execute().body())
                        Log.e("Respuesta:   ",user.getName()+ " "+user.getNickName());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
