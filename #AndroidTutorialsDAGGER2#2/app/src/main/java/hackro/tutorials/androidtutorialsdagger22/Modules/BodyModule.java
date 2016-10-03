package hackro.tutorials.androidtutorialsdagger22.Modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hackro.tutorials.androidtutorialsdagger22.Models.Arm;
import hackro.tutorials.androidtutorialsdagger22.Models.Body;
import hackro.tutorials.androidtutorialsdagger22.Models.Head;
import hackro.tutorials.androidtutorialsdagger22.Models.Leg;

/**
 * Created by david on 3/10/16.
 */
@Module
public class BodyModule {

    @Provides
    @Singleton
    Head provideHead() {
        return new Head();
    }

    @Provides
    @Singleton
    Arm provideArm() {
        return new Arm();
    }

    @Provides
    @Singleton
    Leg provideLeg() {
        return new Leg();
    }

    @Provides
    Body provideBody() {
        return new Body(new Head("head"), new Arm("arm"), new Leg("leg"));
    }

}
