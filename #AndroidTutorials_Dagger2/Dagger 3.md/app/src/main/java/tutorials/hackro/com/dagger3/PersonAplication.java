package tutorials.hackro.com.dagger3;

import android.app.Application;

/**
 * Created by hackro on 9/02/17.
 */
public class PersonAplication extends Application{

    private PersonComponent personComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        personComponent = DaggerPersonComponent.builder()
                .personModule(new PersonModule())
                .build();

    }

    public PersonComponent getPersonComponent() {
        return personComponent;
    }
}
