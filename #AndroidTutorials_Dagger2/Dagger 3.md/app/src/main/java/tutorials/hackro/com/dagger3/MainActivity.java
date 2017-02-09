package tutorials.hackro.com.dagger3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //El objetivo de este ejemplo es injectar PersonApi a la actividad
    
    @Inject
    PersonApi personApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonAplication aplication = (PersonAplication) getApplication();
        aplication.getPersonComponent().inject(this);

        Person person = personApi.getPerson();

        Toast.makeText(this,person.toString(),Toast.LENGTH_SHORT).show();

    }

}
