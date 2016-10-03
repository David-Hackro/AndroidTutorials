package hackro.tutorials.androidtutorialsdagger22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import hackro.tutorials.androidtutorialsdagger22.Components.BodyComponent;
import hackro.tutorials.androidtutorialsdagger22.Components.DaggerBodyComponent;
import hackro.tutorials.androidtutorialsdagger22.Models.Body;
import hackro.tutorials.androidtutorialsdagger22.Modules.BodyModule;

public class MainActivity extends AppCompatActivity {

    private Body body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BodyComponent component = DaggerBodyComponent.builder().bodyModule(new BodyModule()).build();

        body = component.provideBody();

        Toast.makeText(MainActivity.this,body.getHead().getHead() +" "+ body.getArm().getArm()+" "+body.getLed().getLeg(),Toast.LENGTH_SHORT).show();




    }
}
