package tutorials.hackro.com.dagger3;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by hackro on 9/02/17.
 */

//El componente nos ayudara a indicarle a dagger donde debe inyectar la dependencia y en que modulo
//debe buscarla
@Singleton
@Component(modules = {PersonModule.class})
public interface PersonComponent {

    void inject (MainActivity mainActivity);

}
