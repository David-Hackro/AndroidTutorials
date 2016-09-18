package com.example.hackro.calulator.Presenters;

import com.example.hackro.calulator.Interactors.MainInteractorImpl;
import com.example.hackro.calulator.Interfaces.MainInteractor;
import com.example.hackro.calulator.Interfaces.MainPresenter;
import com.example.hackro.calulator.Interfaces.MainView;

/**
 * Created by hackro on 12/09/16.
 */
public class MainPresenterImpl implements MainPresenter {

    private MainView view;
    private MainInteractor interactor;


    public MainPresenterImpl(MainView view) {
        this.view = view;
        interactor = new MainInteractorImpl(this);
    }

    @Override
    public void Operacion(String number_one, String number_two) {
        if(view != null){
            //Interactor
            interactor.Suma(number_one,number_two);
        }
    }

    @Override
    public void showErrorPresenter(String error) {//Los campos estan vacios
        if(view != null){
            view.showError(error);
        }
    }

    @Override
    public void setResultPresenter(String result) {
        if(view != null){
            view.setResult(result);
        }
    }
}
