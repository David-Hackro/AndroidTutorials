package com.example.hackro.calulator.Interactors;

import com.example.hackro.calulator.Interfaces.MainInteractor;
import com.example.hackro.calulator.Interfaces.MainPresenter;

/**
 * Created by hackro on 12/09/16.
 */
public class MainInteractorImpl implements MainInteractor {

    private MainPresenter presenter;
    private double result;
    public MainInteractorImpl(MainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void Suma(String number_one, String number_two) {

        if(number_one.equals("") && number_two.equals("") ){
            presenter.showErrorPresenter("Los campos estan vacios");
        }
        else{

            try{
                result = Double.valueOf(number_one) + Double.valueOf(number_two);
                presenter.setResultPresenter(String.valueOf(result));
            }
            catch (Exception e){
                presenter.showErrorPresenter(e.getMessage());
            }

        }


    }
}
