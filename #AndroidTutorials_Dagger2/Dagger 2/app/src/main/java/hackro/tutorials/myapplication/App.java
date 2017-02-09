package hackro.tutorials.myapplication;

import android.app.Application;

import hackro.tutorials.myapplication.Components.ComponentBody;
import hackro.tutorials.myapplication.Components.DaggerComponentBody;
import hackro.tutorials.myapplication.Modules.ModuleBody;

/**
 * Created by david on 21/10/16.
 */

public class App extends Application {

    private ComponentBody componentBody;

    @Override
    public void onCreate() {
        super.onCreate();
        componentBody = DaggerComponentBody.builder().moduleBody(new ModuleBody()).build();
    }

    public ComponentBody getComponentBody() {
        return componentBody;
    }
}
