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
        //create a list of object type User
        List<User> userList = new ArrayList<>();

        //add some users
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

        /**
        * Map - transform the items emitted by an Observable by applying a function to each item
        * FlatMap - transform the items emitted by an Observable into Observables, then flatten the emissions from those into a single Observable
        * GroupBy - divide an Observable into a set of Observables that each emit a different group of items from the original Observable, organized by key
        *
        * - When do you use map vs flatMap in RxJava? : https://t.co/Q5Aos7otXR
        * liveedu.tv: https://www.liveedu.tv/hackro/videos/OxpYV-tutorialeshackro-rxjava-3/
        **/




        //First Example
        //Map
        Observable.from(userList)
                .map(us -> "{name:"+us.getName()+",age:"+us.getAge()+"}")
                .subscribe(u -> Log.e("User: ",u.toString()));


        //Second Example
        //FlatMap
        Observable.from(userList)
                .flatMap(us -> {
                        if(us.getAge() >= 18)
                            return Observable.just("User +18 :"+us.toString());
                    return Observable.just("User -18 :"+us.toString());

                })
                .subscribe(u -> Log.e("User: ",u.toString()));



        //Third Example
        //Group users | groupA:(-18) GroupB:(+18)
        Observable.from(userList)
                .groupBy(us -> us.getAge() >= 18)
                .flatMap(grp  -> grp.groupBy(u -> u.getAge() < 18 )
                        .flatMap(grp2 -> grp2.toList())
                )
                .subscribe(u -> Log.e("User: ",u.toString()));

    }
}
