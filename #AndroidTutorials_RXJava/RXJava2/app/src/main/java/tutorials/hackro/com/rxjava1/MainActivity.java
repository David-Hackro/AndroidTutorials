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
        userList.add(new User("Fabiola",15));
        userList.add(new User("Gael",18));
        userList.add(new User("Arturo",9));
        userList.add(new User("Iker",20));
        userList.add(new User("Fabiola",15));
        userList.add(new User("Carolina",87));
        userList.add(new User("Sharon",2));

<<<<<<< HEAD
        /*
                //English definition

                //.distinct(user1 -> user1.getName())//suppress duplicate items
=======
        //From — convert some other object or data structure into an Observable
        //From - convertir algún otro objeto o estructura de datos en un Observable
        Observable.from(userList)
>>>>>>> 2534cd7281a0bf980eebbcad0062b883692abdc4
                //.filter(user1 -> user1.getAge() >= 18) //Applies a filter depending on a condition
                //.skip(1) //suppress n items (first)
                //.skipLast(1)//suppress n items (last)
                //.count()//return number items
                //.take(2) limit the number the results (first)
                //.takeLast(2) limit the number the results (last)
                //.last() // return last item
                //.first() // return first item
        */

        //From — convert some other object or data structure into an Observable
        //From - convertir algún otro objeto o estructura de datos en un Observable
        Observable.from(userList)
                //.distinct(user1 -> user1.getName())//suprime los items repetidos
                //.filter(user1 -> user1.getAge() >= 18) //Aplica un filtro mediante una conficional
                //.skip(1) //suprime los primeros (n) items (Inicio)
                //.skipLast(1)//suprime los ultimo (n) items (Final)
                //.count()//retorna el numero de items
                //.take(2) //limita el numero de items (Inicio)
                //.takeLast(2) //limita el numero de items (Final)
                //.last() // retorna el ultimo item
                //.first() // retorna el primer item
                .subscribe(user -> Log.e("User: ",user.toString()));
        //subscribe: Las emisiones y las notificaciones de un Observable
        // subscribe:operate upon the emissions and notifications from an Observable


    }
}
