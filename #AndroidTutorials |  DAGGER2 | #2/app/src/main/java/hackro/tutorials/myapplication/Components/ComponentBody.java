package hackro.tutorials.myapplication.Components;

import javax.inject.Singleton;

import dagger.Component;
import hackro.tutorials.myapplication.MainActivity;
import hackro.tutorials.myapplication.Modules.ModuleBody;

/**
 * Created by david on 21/10/16.
 */
@Singleton //i have  singleton  in ModuleBody and ModuleBody have Head and head is singleton
@Component(modules = {ModuleBody.class})
public interface ComponentBody {
    void inject(MainActivity mainActivity);//i need inject in MainActivity
}
