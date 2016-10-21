package hackro.tutorials.androidtutorialsdagger22.Components;

import dagger.Component;
import hackro.tutorials.androidtutorialsdagger22.Models.Body;
import hackro.tutorials.androidtutorialsdagger22.Modules.BodyModule;

/**
 * Created by david on 3/10/16.
 */
@Component(modules = {BodyModule.class})
public interface BodyComponent {

    Body provideBody();
}
