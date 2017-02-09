package com.example.hackro.androidtutorialsmvp3.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hackro.androidtutorialsmvp3.Interfaces.MainActivityPresenter;
import com.example.hackro.androidtutorialsmvp3.Interfaces.MainActivityView;
import com.example.hackro.androidtutorialsmvp3.Presenters.MainActivityPresenterImpl;
import com.example.hackro.androidtutorialsmvp3.R;


public class MainActivity extends AppCompatActivity implements MainActivityView {

    private TextView textResponse;
    private ProgressBar progress;
    private MainActivityPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResponse = (TextView) findViewById(R.id.respuesta);
        progress=(ProgressBar) findViewById(R.id.progress);

        presenter= new MainActivityPresenterImpl(this);


    }

    @Override
    public void showProgress(boolean option) {
        if(option)
            progress.setVisibility(View.VISIBLE);
        else
            progress.setVisibility(View.GONE);
    }

    @Override
    public void showError(String error) {
            Toast.makeText(MainActivity.this,error,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showResult(String result) {
        textResponse.setText(result);
    }

    public void servicio(View v){
        presenter.getDataYoutube();
    }

}
