
# Tutoriales Android

[(English Version)]()  

[![N|Solid](https://cfcdnpull-creativefreedoml.netdna-ssl.com/wp-content/uploads/2013/03/00-android-4-0_icons.png)](https://github.com/TutorialesHackro/AndroidTutorials)


Dagger 2
----
    Dagger 2 es el marco de inyección de dependencia.
    Se basa en la solicitud de especificación de Java (JSR) 330.
    Utiliza la generación de código y se basa en anotaciones.
    El código generado es relativamente fácil de leer y depurar.
----

### Indice
  -  [Ejemplo #1](https://github.com/TutorialesHackro/AndroidTutorials/tree/master/%23AndroidTutorials_Dagger2/Dagger%201)

      - [codigo](https://github.com/TutorialesHackro/AndroidTutorials/tree/master/%23AndroidTutorials_Dagger2/Dagger%201)
      - [video]()

  -  [Ejemplo #2](https://github.com/TutorialesHackro/AndroidTutorials/tree/master/%23AndroidTutorials_Dagger2/Dagger%202)

      - [codigo](https://github.com/TutorialesHackro/AndroidTutorials/tree/master/%23AndroidTutorials_Dagger2/Dagger%202)
      - [video]()

  -  [Ejemplo #3](https://github.com/TutorialesHackro/AndroidTutorials/tree/master/%23AndroidTutorials_Dagger2/Dagger%203)

      - [codigo](https://github.com/TutorialesHackro/AndroidTutorials/tree/master/%23AndroidTutorials_Dagger2/Dagger%203)
      - [video]()  


## Dependencias ##

```gradle
//build.gradle
classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'

//build.gradle(app)        
apply plugin: 'com.neenbedankt.android-apt'

apt 'com.google.dagger:dagger-compiler:2.5'
compile 'com.google.dagger:dagger:2.5'
provided 'javax.annotation:jsr250-api:1.0'
```
### [Documentacion Oficial](https://google.github.io/dagger/)

----



## Invitame un cafe :)
[![](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=8Z684VNGVFSJA)


## Contacto ##
    hackro91@gmail.com

License
----
    MIT

**Free Software, Hell Yeah!**
