# Android Tutorials
[![N|Solid](http://i.imgur.com/zMu06FV.png)](https://github.com/David-Hackro)

# Transforming Observables

### Objetivo:
 Trabjar con los operadores con los que puede transformar elementos que son emitidos por un Observable.

----

#### Descripcion
En el ejemplo ocuparemos una lista de objetos `User` el cual  estaremos aplicando agrupacion por mayores y menores de edad,asi como transformar el item por un string mediante map.

----
- `Map`     :  transforma los elementos emitidos por un observable aplicando una función a cada elemento
- `FlatMap`  :   transforma los elementos emitidos por un Observable en Observables, luego aplana las emisiones de éstos en un solo Observable
- `GroupBy`      :      divide un Observable en un conjunto de Observables que cada uno emite un grupo diferente de elementos de la original Observable, organizado por cla



### MainActivity
``` java
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
        userList.add(new User("Paola",14));
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


```



### Problema 1
- Ocupar el operador map,para tranformar el objeto User en un string con los datos
``` java
        //First Example
        //Map
        Observable.from(userList)
                .map(us -> "{name:"+us.getName()+",age:"+us.getAge()+"}")
                .subscribe(u -> Log.e("User: ",u.toString()));a
```



### Resultado
```
E: {name:Mayra,age:14}
E: {name:David,age:23}
E: {name:Jaqueline,age:10}
E: {name:Paulina,age:21}
E: {name:Fabiola,age:15}
E: {name:Gael,age:18}
E: {name:Arturo,age:9}
E: {name:Iker,age:20}
E: {name:Paola,age:14}
E: {name:Carolina,age:87}
E: {name:Sharon,age:2}
```

---

### Problema 2
- Ocupar el operador Flatmap,para tranformar el en un observable
``` java
        //Second Example
        //FlatMap
        Observable.from(userList)
                .flatMap(us -> {
                        if(us.getAge() >= 18)
                            return Observable.just("User +18 :"+us.toString());
                    return Observable.just("User -18 :"+us.toString());

                })
                .subscribe(u -> Log.e("User: ",u.toString()));
```



### Resultado
```
E: {name:Mayra,age:14}
E: {name:David,age:23}
E: {name:Jaqueline,age:10}
E: {name:Paulina,age:21}
E: {name:Fabiola,age:15}
E: {name:Gael,age:18}
E: {name:Arturo,age:9}
E: {name:Iker,age:20}
E: {name:Paola,age:14}
E: {name:Carolina,age:87}
E: {name:Sharon,age:2}
```



---

### Problema 3
- Ocupar el operador GroupBy y crear dos grupos,uno que contenga a los USer con >= 18 y otros con <18 años
``` java
        //Third Example
        //Group users | groupA:(-18) GroupB:(+18)
        Observable.from(userList)
                .groupBy(us -> us.getAge() >= 18)
                .flatMap(grp  -> grp.groupBy(u -> u.getAge() < 18 )
                        .flatMap(grp2 -> grp2.toList())
                )
                .subscribe(u -> Log.e("User: ",u.toString()));
```



### Resultado
```
// < 18 años
 [
    User{name='Mayra', age=14},
    User{name='Jaqueline', age=10},
    User{name='Fabiola', age=15},
    User{name='Arturo', age=9},
    User{name='Paola', age=14},
    User{name='Sharon', age=2}
 ]

// >=18 años
E: [
    User{name='David', age=23},
    User{name='Paulina', age=21},
    User{name='Gael', age=18},
    User{name='Iker', age=20},
    User{name='Carolina', age=87}
   ]


```
### Video
- https://www.liveedu.tv/hackro/RO11V-tutorialeshackro-rxjava-3/

### Documentación

 - [map](http://reactivex.io/documentation/operators/map.html)
 - [flatmap](http://reactivex.io/documentation/operators/flatmap.html)
 - [groupby](http://reactivex.io/documentation/operators/groupby.html)

 - [Cuando ocupar Map y FlatMap](http://stackoverflow.com/questions/22847105/when-do-you-use-map-vs-flatmap-in-rxjava/30313461?stw=2#30313461)
---


[![N|Solid](http://i.imgur.com/ojgul72.png)](https://twitter.com/intent/tweet?text=Transforming%20Observables%20en%20RXJava&url=https://goo.gl/Zsb4VN&hashtags=AndroidTutorials&via=DavidHackro)






----

[![alt text][1.1]][1]
[![alt text][2.1]][2]
[![alt text][3.1]][3]
[![alt text][4.1]][4]
[![alt text][6.1]][6]
[![alt text][7.1]][7]
[![alt text][8.1]][8]
[![alt text][9.1]][9]



[1.1]: http://i.imgur.com/WSJnJGh.png (@DavidHackro)
[2.1]: http://i.imgur.com/LTj71u4.png (Tutoriales Hackro)
[3.1]: http://i.imgur.com/AkKkG9J.png (Tutoriales Hackro)
[4.1]: http://i.imgur.com/62TiA7Z.png (Tutoriales Hackro)

[6.1]: http://i.imgur.com/8bC1N1O.png (Tutoriales Hackro)
[7.1]: http://i.imgur.com/bkADK8K.png (Tutoriales Hackro)
[8.1]: http://i.imgur.com/c4q4tlZ.png (Tutoriales Hackro)
[9.1]: http://i.imgur.com/R6x7ACz.png (Hackro)

[1]: https://twitter.com/DavidHackro
[2]: https://www.facebook.com/TutorialesHackro/
[3]: https://www.youtube.com/channel/UClxVhu_GAuKJO7RSM-JAdtw
[4]: https://www.linkedin.com/in/davidhackro/

[6]: https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=8Z684VNGVFSJA
[7]: http://stackoverflow.com/users/3741698/david-hackro
[8]: https://www.liveedu.tv/hackro/
[9]: https://www.hackerrank.com/hackro91




## Invitame un cafe :)
[![](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=8Z684VNGVFSJA)


License
----
    MIT

**Free Software, Hell Yeah!**
