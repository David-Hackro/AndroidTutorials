# Android Tutorials
[![N|Solid](http://i.imgur.com/zMu06FV.png)](https://github.com/David-Hackro)

# Filtrado de observables

### Objetivo:
Aprender el funcionamiento de los principales funciones de filtrado

----



#### Descripcion
En el ejemplo estaremos ocupando estas funciones de filtrado,para obtener el primer usuario de la lista,el ultimo,los primeros o ultimos 3 y aplicando filtros por la edad de los usuarios.

----
### Funciones

- `distinct()`  :   suprime los items repetidos
- `filter(Tu_condicion)`  :   Aplica un filtro mediante una conficional
- `skip(n)`   :   suprime los primeros (n) items (Inicio)
- `skipLast(n)`  :   suprime los ultimo (n) items (Final)
- `take(n)`   :   limita el numero de items (Inicio)
- `takeLast(n)`   :   limita el numero de items (Final)
- `last()`  :   retorna el ultimo item
- `first()`  :   retorna el primer item



### MainActivity
``` java

        //create a list of objects of type User
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

        //English
        /*.filter(user1 -> user1.getAge() >= 18)//Applies a filter depending on a condition
                //.skip(1) //suppress n items (first)
                //.skipLast(1)//suppress n items (last)
                //.count()//return number items
                //.take(2) limit the number the results (first)
                //.takeLast(2) limit the number the results (last)
                //.last() // return last item
                //.first() // return first item
        */

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



```

---
## Problema 1 
- Aplicar un filtro de edad,mostrar los usuarios con su edad >= 18

```java
    Observable.from(userList)
        .filter(user1 -> user1.getAge() >= 18) //Aplica un filtro mediante una conficional
        .subscribe(user -> Log.e("User: ",user.toString()));
```    
#### Resultado  
```
E: User{name='David', age=23}
E: User{name='Paulina', age=21}
E: User{name='Gael', age=18}
E: User{name='Iker', age=20}
E: User{name='Carolina', age=87}
```
----


## Problema 2
- Mostrar unicamente el primer usuario

```java
    Observable.from(userList)
        .first() // retorna el primer item
        .subscribe(user -> Log.e("User: ",user.toString()));
```    
#### Resultado  
```
E: User{name='Mayra', age=14}
```
---
## Problema 3
- Mostrar unicamente el ultimo usuario

```java
    Observable.from(userList)
        .last() // retorna el ultimo item
        .subscribe(user -> Log.e("User: ",user.toString()));
```    
#### Resultado  
```
E: User{name='Sharon', age=2}
```

---
## Problema 4
- Suprimir los primeros 4 usuarios

```java
    Observable.from(userList)
        .skip(4) //suprime los primeros (n) items (Inicio)
        .subscribe(user -> Log.e("User: ",user.toString()));
```    
### Resultado
```
E: User{name='Fabiola', age=15}
E: User{name='Gael', age=18}
E: User{name='Arturo', age=9}
E: User{name='Iker', age=20}
E: User{name='Fabiola', age=15}
E: User{name='Carolina', age=87}
E: User{name='Sharon', age=2}
```



---
## Problema 5
- Suprimir los ultimos  2 usuarios

```java
    Observable.from(userList)
        .skipLast(2)//suprime los ultimo (n) items (Final)
        .subscribe(user -> Log.e("User: ",user.toString()));
```    
### Resultado
```
E: User{name='Mayra', age=14}
E: User{name='David', age=23}
E: User{name='Jaqueline', age=10}
E: User{name='Paulina', age=21}
E: User{name='Fabiola', age=15}
E: User{name='Gael', age=18}
E: User{name='Arturo', age=9}
E: User{name='Iker', age=20}
E: User{name='Fabiola', age=15}
```

---


---
## Problema 6
- Mostrar todos los usuarios,sin usuarios repetidos(name),en este caso el user `Fabiola` se repite 2 veces

```java
    Observable.from(userList)
        .distinct(user1 -> user1.getName())//suprime los items repetidos
        .subscribe(user -> Log.e("User: ",user.toString()));
```    
### Resultado
```
E: User{name='Mayra', age=14}
E: User{name='David', age=23}
E: User{name='Jaqueline', age=10}
E: User{name='Paulina', age=21}
E: User{name='Fabiola', age=15}
E: User{name='Gael', age=18}
E: User{name='Arturo', age=9}
E: User{name='Iker', age=20}
E: User{name='Carolina', age=87}
E: User{name='Sharon', age=2}
```









---
### Video
- https://www.liveedu.tv/hackro/videos/pQ67G-tutorialeshackro-rxjava-2/ (En el video hago distintas combinaciones)

### Documentación


- [distinct](http://reactivex.io/documentation/operators/distinct.html) 
- [filter](http://reactivex.io/documentation/operators/filter.html)
- [skip](http://reactivex.io/documentation/operators/skip.html)
- [skipLast](http://reactivex.io/documentation/operators/skiplast.html)
- [take](http://reactivex.io/documentation/operators/take.html)
- [takeLast](http://reactivex.io/documentation/operators/takelast.html)
- [last](http://reactivex.io/documentation/operators/last.html)
- [first](http://reactivex.io/documentation/operators/first.html)

---

[![N|Solid](http://i.imgur.com/ojgul72.png)](https://twitter.com/intent/tweet?text=Subscribe%20Observable%20en%20RXJava&url=https://goo.gl/ct4s1U&hashtags=AndroidTutorials&via=DavidHackro)


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
