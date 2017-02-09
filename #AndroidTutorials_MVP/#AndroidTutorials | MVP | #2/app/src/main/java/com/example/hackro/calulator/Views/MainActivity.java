package com.example.hackro.calulator.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hackro.calulator.Interfaces.MainPresenter;
import com.example.hackro.calulator.Interfaces.MainView;
import com.example.hackro.calulator.Presenters.MainPresenterImpl;
import com.example.hackro.calulator.R;

public class MainActivity extends AppCompatActivity implements MainView{

    private EditText main_number_one,main_number_two;
    private MainPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_number_one = (EditText) findViewById(R.id.main_number_one);
        main_number_two = (EditText) findViewById(R.id.main_number_two);

        presenter = new MainPresenterImpl(this);
    }

    @Override
    public void setResult(String result) {
        Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String error) {////Los campos estan vacios
        Toast.makeText(MainActivity.this,error,Toast.LENGTH_SHORT).show();
    }

    public void suma(View v)
    {
        //Mandar a llamar un metodo del presentador
        presenter.Operacion(main_number_one.getText().toString(),main_number_two.getText().toString());

    }
}
