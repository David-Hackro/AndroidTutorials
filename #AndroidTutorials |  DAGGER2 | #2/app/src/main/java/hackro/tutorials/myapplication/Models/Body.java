package hackro.tutorials.myapplication.Models;

/**
 * Created by david on 21/10/16.
 */

public class Body {
//this model need all models
    /*-head --> this model or entity is singleton ;)
    -arm(left)
    -arm(right)
    -leg(left)
    -leg(right)
*/

    private Head head;
    private Arm armLeft;
    private Arm armRigth;
    private Leg legLeft;
    private Leg legRigth;
    //Inject the dependencies in body


    public Body(Head head, Arm armLeft, Arm armRigth, Leg legLeft, Leg legRigth) {
        this.head = head;
        this.armLeft = armLeft;
        this.armRigth = armRigth;
        this.legLeft = legLeft;
        this.legRigth = legRigth;
    }


    //using this method you can seee the propierties in Toas or log
    @Override
    public String toString() {
        return "Body{" +
                "head=" + head.getName() + "\n" +
                ", armLeft=" + armLeft.getName() + "\n" +

                ", armRigth=" + armRigth.getName() + "\n" +

                ", legLeft=" + legLeft.getName() + "\n" +

                ", legRigth=" + legRigth.getName() + "\n" +

                '}';
    }
}


