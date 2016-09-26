package com.example.hackro.androidtutorialsmvp3.Presenters;

import com.example.hackro.androidtutorialsmvp3.Interactors.MainActivityInteractorImpl;
import com.example.hackro.androidtutorialsmvp3.Interfaces.MainActivityInteractor;
import com.example.hackro.androidtutorialsmvp3.Interfaces.MainActivityPresenter;
import com.example.hackro.androidtutorialsmvp3.Interfaces.MainActivityView;

/**
 * Created by hackro on 25/09/16.
 */
public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityView view;
    private MainActivityInteractor interactor;

    public MainActivityPresenterImpl(MainActivityView view) {
        this.view = view;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void getDataYoutube() {
        if(view != null)
        {
            view.showProgress(true);
            interactor.getDataYoutubeInteractor();

        }
    }

    @Override
    public void showErrorPresenter(String error) {
            if(view != null)
            {
                view.showProgress(false);
                view.showError(error);
            }
    }

    @Override
    public void showResultPresenter(String result) {
        if(view != null)
        {
            view.showProgress(false);
            view.showResult(result);
        }
    }


}
