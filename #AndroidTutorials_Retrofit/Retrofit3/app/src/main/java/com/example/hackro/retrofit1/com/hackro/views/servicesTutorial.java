package com.example.hackro.retrofit1.com.hackro.views;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by hackro on 10/01/17.
 */
public interface servicesTutorial {

    @GET("usersFake")
    Call<List<ResponseService>> getUsersGet();


    @POST("usersFake")
    Call<List<ResponseService>> getUsersPost();

    //https://androidtutorials.herokuapp.com/findUser?id=1
    @GET("findUser")
    Call<ResponseService> findUserGet(@Query("id") int idUser);//Recuerda que el valor @Query(valor) debe ser igual a como lo espera el servicio

}
