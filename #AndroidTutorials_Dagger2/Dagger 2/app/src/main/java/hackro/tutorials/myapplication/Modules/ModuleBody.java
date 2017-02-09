package hackro.tutorials.myapplication.Modules;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hackro.tutorials.myapplication.Models.Arm;
import hackro.tutorials.myapplication.Models.Body;
import hackro.tutorials.myapplication.Models.Head;
import hackro.tutorials.myapplication.Models.Leg;

/**
 * Created by david on 21/10/16.
 */
@Module //need this anotation ok :D
public class ModuleBody {

    //first - head
    //why? because my body have a head  :p lol
     @Singleton
     @Provides
    public Head providesHEad(){
         return new Head("Head");
     }

    //now the similar process using other dependencies
    // you need set name using this annotation
    @Provides
    @Named("Left")
    public Arm providesArmLeft(){
        return new Arm("Arm_left");
    }

    @Provides
    @Named("Rigth")
    public Arm providesArmRigth(){
        return new Arm("Arm_Rigth");
    }


    @Provides
    @Named("Left")
    public Leg providesLegLeft(){
        return new Leg("Leg_left");
    }

    @Provides
    @Named("Rigth")
    public Leg providesLegRigth(){
        return new Leg("Leg_Rigth");
    }



    //look this method

    @Provides
    public Body providesBody(Head head, @Named("Left") Arm armLeft,@Named("Rigth")  Arm armRigth,@Named("Left")  Leg legLeft,@Named("Rigth")  Leg legRigth){
        return new Body(head, armLeft, armRigth, legLeft, legRigth);
    }







}
