package hackro.tutorials.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Named;

import hackro.tutorials.myapplication.Models.Arm;
import hackro.tutorials.myapplication.Models.Body;
import hackro.tutorials.myapplication.Models.Head;
import hackro.tutorials.myapplication.Models.Leg;

public class MainActivity extends AppCompatActivity {

   @Inject
   Body body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App)getApplication()).getComponentBody().inject(this);


        ((App)getApplication()).getComponentBody().inject(this);



        Toast.makeText(this,body.toString(),Toast.LENGTH_SHORT).show();


    }
}
