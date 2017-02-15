package tutorials.hackro.com.rxjava1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creamos una lista de objetos tipo User
        List<User> userList = new ArrayList<>();

        //Agregamos algunos usuarios
        userList.add(new User("Mayra",14));
        userList.add(new User("David",23));
        userList.add(new User("Jaqueline",10));
        userList.add(new User("Paulina",21));


        //From — convert some other object or data structure into an Observable
        //From - convertir algún otro objeto o estructura de datos en un Observable
        Observable.from(userList)
                .subscribe(user -> Log.e("User: ",user.toString()));
        //subscribe: Las emisiones y las notificaciones de un Observable
        // subscribe:operate upon the emissions and notifications from an Observable

        //Basicamente, en el from,indicamos la lista o estructura de datos,la cual sera

    }
}
