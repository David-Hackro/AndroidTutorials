package com.example.hackro.androidtutorialsmvp3.Interfaces;

import com.example.hackro.androidtutorialsmvp3.Models.ResponseYoutube;

import retrofit2.http.Header;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by hackro on 25/09/16.
 */
public interface wsServiceYoutube {

    @POST("getDataYoutubes")
    Observable<ResponseYoutube> getDataYoutubeService(@Header("Authorization") String auth);

}
