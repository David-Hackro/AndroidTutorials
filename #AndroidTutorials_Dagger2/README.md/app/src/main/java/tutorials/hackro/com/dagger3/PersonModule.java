package tutorials.hackro.com.dagger3;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hackro on 9/02/17.
 */
@Module//Clase (Modulo) que se encargara de proveer una instancia de PersonApi
//Recuerda que dentro encontraras la anotacion @Provides
public class PersonModule {

    @Provides
    @Singleton
    PersonApi providesPersonApi(){
        return new PersonApi();
    }


}
