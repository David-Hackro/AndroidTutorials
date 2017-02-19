# Android Tutorials
[![N|Solid](http://i.imgur.com/zMu06FV.png)](https://github.com/David-Hackro)

# Subscribe - Observable

### Objetivo:
Comprender que es y como funciona el operador from  y el Subscribe

----

#### Descripcion
En el ejemplo ocuparemos una lista de objetos `User` el cual haremos un recorrido de cada
uno de los items y los mostraremos en consola.

----
- `Observable`     :  En ReactiveX un observador se suscribe a un Observable. Entonces ese observador reacciona a cualquier ítem o secuencia de ítems que el Observable emita.
- `From`  :   convertir algún otro objeto o estructura de datos en un Observable
- `Subscribe`      :      Las emisiones y las notificaciones de un Observable
## User.java

``` java
public class User {
    private String name;
    private int age;
    }
```

### MainActivity
``` java
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

```

### Resultado
```
E: User{name='Mayra', age=14}
E: User{name='David', age=23}
E: User{name='Jaqueline', age=10}
E: User{name='Paulina', age=21}
```
### Video
- https://www.liveedu.tv/hackro/videos/gg6Mq-tutorialeshackro-rxjava-1/ (Mal audio sorry)

### Documentación

 - [Observable](http://reactivex.io/documentation/observable.html)
 - [From](http://reactivex.io/documentation/operators/from.html)
 - [Subscribe](http://reactivex.io/documentation/operators/subscribe.html)

---



[![N|Solid](http://i.imgur.com/ojgul72.png)](https://twitter.com/intent/tweet?text=Ejemplos%20practicos%20en%20Android&url=https://github.com/TutorialesHackro/AndroidTutorials&hashtags=AndroidTutorials&via=DavidHackro)






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
