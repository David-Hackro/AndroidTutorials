package com.example.hackro.androidtutorialsmvp3.Interfaces;

/**
 * Created by hackro on 25/09/16.
 */
public interface MainActivityView {

    void showProgress(boolean option);
    void showError(String error);
    void showResult(String result);
}
