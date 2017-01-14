package com.example.hackro.retrofit1.com.hackro.views;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by hackro on 10/01/17.
 */
 //Interface que contiene los metodos que ocuparemos
public interface servicesTutorial {

    @GET("usersFake")//indicamos el metodo y el endpoint
    Call<List<ResponseService>> getUsersGet();//Recuerda que debes colocar como recibiremos esos datos,en este caso una lista de objs


    @POST("usersFake")//Metodo post
    Call<List<ResponseService>> getUsersPost();
}
