package com.example.hackro.androidtutorialsmvp3.Interactors;

import android.util.Base64;

import com.example.hackro.androidtutorialsmvp3.Interfaces.MainActivityInteractor;
import com.example.hackro.androidtutorialsmvp3.Interfaces.MainActivityPresenter;
import com.example.hackro.androidtutorialsmvp3.Interfaces.wsServiceYoutube;
import com.example.hackro.androidtutorialsmvp3.Models.Item;
import com.example.hackro.androidtutorialsmvp3.Models.ResponseYoutube;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by hackro on 25/09/16.
 */
public class MainActivityInteractorImpl implements MainActivityInteractor {

    private Retrofit retrofit;
    private wsServiceYoutube serviceYoutube;
    private String result;
    private MainActivityPresenter presenter;


    public MainActivityInteractorImpl(MainActivityPresenter presenter) {
        this.presenter = presenter;

        retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://androidtutorials.herokuapp.com/")
                .build();

        serviceYoutube = retrofit.create(wsServiceYoutube.class);



    }

    @Override
    public void getDataYoutubeInteractor() {
        String basicAuth = "Basic " + Base64.encodeToString(String.format("%s:%s", "tutoriales", "hackro").getBytes(), Base64.NO_WRAP);

        Observable<ResponseYoutube> respuesta =  serviceYoutube.getDataYoutubeService(basicAuth);

        respuesta.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ResponseYoutube>() {
                    @Override
                    public void onCompleted() {
                            presenter.showResultPresenter(result);
                    }

                    @Override
                    public void onError(Throwable e) {
                        presenter.showErrorPresenter(e.getMessage());
                    }

                    @Override
                    public void onNext(ResponseYoutube responseYoutube) {
                        for(Item i : responseYoutube.getItems())
                        {
                            result += i.getSnippet().getTitle() +" \n ";
                        }
                    }
                });

    }
}
