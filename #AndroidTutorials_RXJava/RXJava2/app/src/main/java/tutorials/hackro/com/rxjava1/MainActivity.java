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
        userList.add(new User("Carolina",87));
        userList.add(new User("Sharon",2));

        /*
        *  User{name='David', age=23}
02-16 13:38:32.533 8175-8175/tutorials.hackro.com.rxjava1 E/User:: User{name='Paulina', age=21}
02-16 13:38:32.534 8175-8175/tutorials.hackro.com.rxjava1 E/User:: User{name='Gael', age=18}
02-16 13:38:32.534 8175-8175/tutorials.hackro.com.rxjava1 E/User:: User{name='Iker', age=20}
02-16 13:38:32.534 8175-8175/tutorials.hackro.com.rxjava1 E/User:: User{name='Carolina', age=87}
        * */
        //From — convert some other object or data structure into an Observable
        //From - convertir algún otro objeto o estructura de datos en un Observable
        Observable.from(userList)
                //.filter(user1 -> user1.getAge() >= 18) //Applies a filter depending on a condition
                //.skip(1) //suppress n items (first)
                //.skipLast(1)//suppress n items (last)
                //.count()//return number items
                //.take(2) limit the number the results (first)
                //.takeLast(2) limit the number the results (last)
                //.last() // return last item
                //.first() // return first item
                .subscribe(user -> Log.e("User : ",user.toString()));
        //subscribe: Las emisiones y las notificaciones de un Observable
        // subscribe:operate upon the emissions and notifications from an Observable

        //Basicamente, en el from,indicamos la lista o estructura de datos,la cual sera

    }
}
