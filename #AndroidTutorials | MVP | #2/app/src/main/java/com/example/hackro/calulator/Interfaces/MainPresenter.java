package com.example.hackro.calulator.Interfaces;

/**
 * Created by hackro on 12/09/16.
 */
public interface MainPresenter {

    void Operacion(String number_one,String number_two);
    void showErrorPresenter(String error);
    void setResultPresenter(String result);

}
